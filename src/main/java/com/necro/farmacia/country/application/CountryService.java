package com.necro.farmacia.country.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.country.domain.Country;

/**
 * CountryService
 */
public interface CountryService {

    Country saveCountry(Country country);

    Country updateCountry(Long id, Country country);

    void deleteCountry(Long id);

    List<Country> findAll();

    Optional<Country> findById(Long id);

}