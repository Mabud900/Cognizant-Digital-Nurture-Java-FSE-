package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cognizant.springlearn.model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public Country getCountryIndia() {
        return countryService.getCountry();
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/countries/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {
        Country getCountry = countryService.getCountryByCode(code);

        if (getCountry == null) return ResponseEntity.notFound().build();

        return ResponseEntity.status(HttpStatus.OK).body(getCountry);
    }
}