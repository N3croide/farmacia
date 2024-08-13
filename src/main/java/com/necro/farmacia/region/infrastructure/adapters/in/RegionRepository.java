package com.necro.farmacia.region.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.region.domain.Region;

/**
 * RegionRepository
 */
public interface RegionRepository extends JpaRepository<Region, Long> {

}