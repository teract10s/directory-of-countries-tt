package com.example.directoryofcountriestt.service;

import com.example.directoryofcountriestt.dto.CountryResponseDto;
import com.example.directoryofcountriestt.entity.Country;
import com.example.directoryofcountriestt.mapper.CountryMapper;
import com.example.directoryofcountriestt.repository.CountryRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public CountryResponseDto getCountryByParams(String name, Long code) {
        return name == null ? getCountryByCode(code) : getCountryByName(name);
    }

    private CountryResponseDto getCountryByName(String name) {
        Country country = countryRepository.findByShortName(name)
                .orElseThrow(() -> new EntityNotFoundException("Can't find country with name: " + name));
        return countryMapper.toResponseDto(country);
    }

    private CountryResponseDto getCountryByCode(Long code) {
        Country country = countryRepository.findByCountryCode(code)
                .orElseThrow(() -> new EntityNotFoundException("Can't find country with code: " + code));
        return countryMapper.toResponseDto(country);
    }
}
