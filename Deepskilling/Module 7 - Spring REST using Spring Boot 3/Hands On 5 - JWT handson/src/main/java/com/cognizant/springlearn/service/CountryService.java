package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CountryService {

    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    Map<String, Country> countryMap = context.getBeansOfType(Country.class);

    List<Country> countryList = countryMap.values().stream().toList();

    public Country getCountry() {
        // Return any country
        return context.getBean("in", Country.class);
    }

    public List<Country> getAllCountries() {
        return countryList;
    }

    public Country getCountryByCode(String code) {
        Country country = countryList.stream().filter(
                country1 ->  country1.getCode().equalsIgnoreCase(code)
        ).findAny().orElse(null);

        return country;
    }
}
