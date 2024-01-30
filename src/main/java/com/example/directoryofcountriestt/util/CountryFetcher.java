package com.example.directoryofcountriestt.util;

import com.example.directoryofcountriestt.dto.ExternalCountryDto;
import com.example.directoryofcountriestt.entity.Country;
import com.example.directoryofcountriestt.mapper.CountryMapper;
import com.example.directoryofcountriestt.repository.CountryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class CountryFetcher implements CommandLineRunner {
    private final RestTemplate restTemplate;
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;
    @Value("${directory.url}")
    private String url;

    @Override
    public void run(String... args) throws Exception {
        String forEntity = restTemplate.getForEntity(url, String.class).getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        ExternalCountryDto[] countryResponseDtos =
                objectMapper.readValue(forEntity, ExternalCountryDto[].class);
        List<Country> fetchedCountries = Arrays.stream(countryResponseDtos)
                .map(countryMapper::toCountry)
                .toList();
        countryRepository.saveAll(fetchedCountries);
    }
}
