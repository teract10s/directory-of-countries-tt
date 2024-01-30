package com.example.directoryofcountriestt.controller;

import com.example.directoryofcountriestt.dto.CountryResponseDto;
import com.example.directoryofcountriestt.service.CountryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/countries")
@Tag(name = "Country controller",
        description = "Here we have endpoint for getting information about country")
public class CountryController {
    private final CountryService countryService;

    @Operation(summary = "Get info about country",
            description = "As a user you have to give country name(in cyrillic or latin) "
                    + "or country code. As a request you will get NOT_FOUND if we don't "
                    + "have info about this country or json about if we have information "
                    + "about the country.")
    @GetMapping
    public CountryResponseDto getInfoByCountryByName(
            @RequestParam(required = false) String countryName,
            @RequestParam(required = false) Long countryCode) {
        return countryService.getCountryByParams(countryName, countryCode);
    }
}
