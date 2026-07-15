package com.cognizant.springlearn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger logger = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    Country(){
        logger.info("Inside Country Constructor.");
    }
    public String getCode(){
        logger.debug("Inside getCode()");
        return code;
    }

    public void setCode(String code) {
        logger.debug("Inside setCode()");
        this.code = code;
    }

    public String getName(){
        logger.debug("Inside getName()");
        return name;
    }

    public void setName(String name){
        logger.debug("Inside setNameI()");
        this.name=name;
    }

    @Override
    public String toString(){
        return "County [code="+code+", name="+name+"]";
    }
}
