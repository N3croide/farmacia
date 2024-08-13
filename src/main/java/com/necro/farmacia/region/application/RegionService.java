package com.necro.farmacia.region.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.region.domain.Region;

/**
 * RegionService
 */
public interface RegionService {

    Region saveRegion(Region region);

    Region updateRegion(Long id, Region region);

    void deleteRegion(Long id);

    List<Region> findAll();

    Optional<Region> findById(Long id);
}