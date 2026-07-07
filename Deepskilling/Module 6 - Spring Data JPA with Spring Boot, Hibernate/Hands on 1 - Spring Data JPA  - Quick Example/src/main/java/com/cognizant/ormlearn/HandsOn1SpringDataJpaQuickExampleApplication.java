package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class HandsOn1SpringDataJpaQuickExampleApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HandsOn1SpringDataJpaQuickExampleApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(HandsOn1SpringDataJpaQuickExampleApplication.class, args);

        countryService = context.getBean(CountryService.class);

        Country country = new Country();
        country.setCode("FR");
        country.setName("France");

        Country mycountry=new Country();
        mycountry.setCode("PK");
        mycountry.setName("Pakistan");

        countryService.addCountry(country);
        countryService.addCountry(mycountry);
        //countryService.deleteCountry();

        testGetAllCountries();
        getAllCountriesTest();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start");

        List<Country> countries = countryService.getAllCountries();

        LOGGER.debug("countries={}", countries);

        LOGGER.info("End");
    }

    private static void getAllCountriesTest() {
        //valid case
        try{
            Country country=countryService.findCountryByCode("IN");
            LOGGER.debug("Country:{}",country);
        }
        catch(CountryNotFoundException e1){
            LOGGER.info("Country Found",e1);
        }

        //invalid case
        try {
            Country country = countryService.findCountryByCode("HI");
            LOGGER.debug("Country: {}", country);
        } catch (CountryNotFoundException e2) {
            LOGGER.error("Country not found", e2);
        }

        //one more valid case
        try{
            Country mycountry=countryService.findCountryByCode("PK");
            LOGGER.debug("Country:{}",mycountry);
        }
        catch(CountryNotFoundException e3){
            LOGGER.info("Country Found",e3);
        }

        LOGGER.info("End");

    }
}