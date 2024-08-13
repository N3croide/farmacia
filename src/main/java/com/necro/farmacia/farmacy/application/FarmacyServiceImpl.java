package com.necro.farmacia.farmacy.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.farmacy.domain.Farmacy;
import com.necro.farmacia.farmacy.infrastructure.adapters.in.FarmacyRepository;

import jakarta.transaction.Transactional;

/**
 * FarmacyServiceImpl
 */
@Service
public class FarmacyServiceImpl implements FarmacyService {
    @Autowired
    private FarmacyRepository farmacyRepository;

    @Transactional
    @Override
    public void deleteFarmacy(Long id) {
        farmacyRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Farmacy> findAll() {
        return farmacyRepository.findAll();
    }

    @Transactional
    @Override
    public Farmacy saveFarmacy(Farmacy farmacy) {
        return farmacyRepository.save(farmacy);
    }

    @Transactional
    @Override
    public Farmacy updateFarmacy(Long id, Farmacy farmacy) {
        if (farmacyRepository.existsById(id)) {
            farmacy.setId(id);
            return farmacyRepository.save(farmacy);
        } else {
            throw new RuntimeException("farmacy not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<Farmacy> findById(Long id) {
        return farmacyRepository.findById(id);
    }

}