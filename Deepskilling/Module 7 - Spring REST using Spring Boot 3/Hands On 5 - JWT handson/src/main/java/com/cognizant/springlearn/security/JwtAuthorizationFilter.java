package com.cognizant.springlearn.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import java.io.IOException;
import java.util.ArrayList;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter{
    private static final Logger logger=LoggerFactory.getLogger(JwtAuthorizationFilter.class);

    public JwtAuthorizationFilter(AuthenticationManager authenticationManager){
        super(authenticationManager);
        logger.info("Start");
        logger.debug("{}: ", authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException{
        logger.info("Start");
        String header=req.getHeader("Authorization");
        logger.debug(header);

        if(header!=null || !header.startsWith("Bearer ")){
            chain.doFilter(req,res);
            return;
        }
        UsernamePasswordAuthenticationToken authentication= getAuthentication(req);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(req,res);
        logger.info("End");
    }
    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request){
        String token=request.getHeader("Authorization");
        if(token!=null){
            //parse token
            Jws<Claims> jws;
            try{
                jws= Jwts.parser().setSigningKey("secretKey").parseClaimsJws(token.replace("Bearer ",""));
                String user=jws.getBody().getSubject();
                logger.debug(user);
                if(user!=null){
                    return new UsernamePasswordAuthenticationToken(user,null, new ArrayList<>());
                }
            }
            catch(JwtException ex){
                return null;
            }
            return null;
        }
        return null;
    }
}
