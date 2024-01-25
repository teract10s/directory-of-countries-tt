package com.example.directoryofcountriestt.controller;

import com.example.directoryofcountriestt.dto.CountryResponseDto;
import com.example.directoryofcountriestt.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping
        public CountryResponseDto getInfoByCountryByName(@RequestParam(required = false) String countryName,
                                                         @RequestParam(required = false) Long countryCode) {
        return countryService.getCountryByParams(countryName, countryCode);
    }
}
