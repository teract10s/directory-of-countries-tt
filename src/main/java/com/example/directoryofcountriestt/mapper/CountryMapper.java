package com.example.directoryofcountriestt.mapper;

import com.example.directoryofcountriestt.dto.CountryResponseDto;
import com.example.directoryofcountriestt.dto.ExternalCountryDto;
import com.example.directoryofcountriestt.entity.Country;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        implementationPackage = "<PACKAGE_NAME>.impl",
        uses = CountryInfoMapper.class)
public interface CountryMapper {
    @Mapping(source = "shortName", target = "name")
    @Mapping(source = "countryInfo.capital", target = "capital")
    @Mapping(source = "countryInfo.region", target = "region")
    @Mapping(source = "countryInfo.languages", target = "languages")
    @Mapping(source = "countryInfo.timezones", target = "timezones")
    @Mapping(source = "countryInfo.continents", target = "continents")
    @Mapping(source = "countryInfo.flagPng", target = "flagUrl")
    @Mapping(source = "countryInfo.googleMaps", target = "googleMaps")
    CountryResponseDto toResponseDto(Country country);

    @Mapping(source = "code", target = "countryCode")
    Country toCountry(ExternalCountryDto countryDto);
}
