package com.example.directoryofcountriestt.mapper;

import com.example.directoryofcountriestt.dto.CountryResponseDto;
import com.example.directoryofcountriestt.entity.Country;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        implementationPackage = "<PACKAGE_NAME>.impl")
public interface CountryMapper {
    @Mapping(source = "shortName", target = "name")
    CountryResponseDto toResponseDto(Country country);
}
