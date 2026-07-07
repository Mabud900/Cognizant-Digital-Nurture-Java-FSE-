package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class HandsOn2QueryMethodsAndOrMappingApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(HandsOn2QueryMethodsAndOrMappingApplication.class);

    private static CountryRepository countryRepository;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HandsOn2QueryMethodsAndOrMappingApplication.class, args);
        countryRepository = context.getBean(CountryRepository.class);

        testSearchCountry();
        // testSearchCountrySorted();
        // testCountryByLetter();
    }

    private static void testSearchCountry() {
        LOGGER.info("Start");
        List<Country> results = countryRepository.findByNameContaining("ou");
        results.forEach(c -> LOGGER.debug("{}", c));
        LOGGER.info("End");
    }

    private static void testSearchCountrySorted() {
        LOGGER.info("Start");
        List<Country> results = countryRepository.findByNameContainingOrderByNameAsc("ou");
        results.forEach(c -> LOGGER.debug("{}", c));
        LOGGER.info("End");
    }

    private static void testCountryByLetter() {
        LOGGER.info("Start");
        List<Country> results = countryRepository.findByNameStartingWith("Z");
        results.forEach(c -> LOGGER.debug("{}", c));
        LOGGER.info("End");
    }
}