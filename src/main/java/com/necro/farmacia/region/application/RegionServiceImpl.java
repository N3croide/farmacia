package com.necro.farmacia.region.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.region.domain.Region;
import com.necro.farmacia.region.infrastructure.adapters.in.RegionRepository;

import jakarta.transaction.Transactional;

/**
 * RegionServiceImpl
 */
@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Transactional
    @Override
    public void deleteRegion(Long id) {
        regionRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Region> findAll() {
        return regionRepository.findAll();
    }

    @Transactional
    @Override
    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    @Transactional
    @Override
    public Region updateRegion(Long id, Region region) {
        if (regionRepository.existsById(id)) {
            region.setId(id);
            return regionRepository.save(region);
        } else {
            throw new RuntimeException("region not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<Region> findById(Long id) {
        return regionRepository.findById(id);
    }
}