package com.example.directoryofcountriestt.dto;

public record CountryResponseDto(String name,
                                 String capital,
                                 String languages,
                                 String alphaThree,
                                 String region,
                                 double terrorismIndex,
                                 int corruption,
                                 double moneyLaundering,
                                 String timezones,
                                 String continents,
                                 String flagUrl,
                                 String googleMaps) {
}
