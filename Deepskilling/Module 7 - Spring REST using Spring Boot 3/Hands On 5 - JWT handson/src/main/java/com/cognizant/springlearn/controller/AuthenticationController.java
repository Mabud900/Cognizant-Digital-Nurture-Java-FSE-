package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class AuthenticationController {
    private static final Logger logger= LoggerFactory.getLogger(AuthenticationController.class);

    @RequestMapping("/authenticate")
    public Map<String,String> authenticate(@RequestHeader("Authorization") String authHeader){
        logger.info("Authentication Request Received");
        logger.debug("authHeader {}",authHeader);
        Map<String,String>map=new HashMap<String,String>();
        map.put("token","");
        logger.info("Authentication response sent");
        return map;
    }
}
