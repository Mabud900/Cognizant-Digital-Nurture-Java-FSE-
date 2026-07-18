package com.cognizant.springlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        return (Country) applicationContext.getBean("in");
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return (List<Country>) applicationContext.getBean("countryList");
    }
}