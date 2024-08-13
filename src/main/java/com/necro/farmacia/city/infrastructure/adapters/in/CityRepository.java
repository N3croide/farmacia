package com.necro.farmacia.city.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.city.domain.City;

/**
 * CityRepository
 */
public interface CityRepository extends JpaRepository<City, Long> {

}