package com.example.directoryofcountriestt.mapper;

import com.example.directoryofcountriestt.dto.ExternalCountryInfoDto;
import com.example.directoryofcountriestt.entity.CountryInfo;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        implementationPackage = "<PACKAGE_NAME>.impl")
public interface CountryInfoMapper {
    CountryInfo toCountryInfo(ExternalCountryInfoDto countryInfoDto);
}
