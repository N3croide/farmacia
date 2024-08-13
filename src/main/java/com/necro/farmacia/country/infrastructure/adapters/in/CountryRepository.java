package com.necro.farmacia.country.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.country.domain.Country;

/**
 * CountryRepository
 */
public interface CountryRepository extends JpaRepository<Country, Long> {

}