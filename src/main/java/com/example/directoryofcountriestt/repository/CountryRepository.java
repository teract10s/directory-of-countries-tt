package com.example.directoryofcountriestt.repository;

import com.example.directoryofcountriestt.entity.Country;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    Optional<Country> findByShortName(String name);

    Optional<Country> findByLatinName(String name);

    Optional<Country> findByCountryCode(Long code);
}
