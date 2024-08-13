package com.necro.farmacia.farmacyMedicine.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicine;
import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicineId;
import com.necro.farmacia.farmacyMedicine.infrastructure.adapters.in.FarmacyMedicineRepository;

import jakarta.transaction.Transactional;

/**
 * FarmacyMedicineServiceImpl
 */
@Service
public class FarmacyMedicineServiceImpl implements FarmacyMedicineService {
    @Autowired
    private FarmacyMedicineRepository farmacyMedicineRepository;

    @Transactional
    @Override
    public void deleteFarmacyMedicine(FarmacyMedicineId id) {
        farmacyMedicineRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<FarmacyMedicine> findAll() {
        return farmacyMedicineRepository.findAll();
    }

    @Transactional
    @Override
    public FarmacyMedicine saveFarmacyMedicine(FarmacyMedicine farmacyMedicine) {
        return farmacyMedicineRepository.save(farmacyMedicine);
    }

    @Transactional
    @Override
    public FarmacyMedicine updateFarmacyMedicine(FarmacyMedicineId id, FarmacyMedicine farmacyMedicine) {
        if (farmacyMedicineRepository.existsById(id)) {
            farmacyMedicine.setId(id);
            return farmacyMedicineRepository.save(farmacyMedicine);
        } else {
            throw new RuntimeException("farmacyMedicine not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<FarmacyMedicine> findById(FarmacyMedicineId id) {
        return farmacyMedicineRepository.findById(id);
    }

}