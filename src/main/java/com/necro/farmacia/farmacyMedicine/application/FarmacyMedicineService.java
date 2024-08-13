package com.necro.farmacia.farmacyMedicine.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicine;
import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicineId;

/**
 * FarmacyMedicineService
 */
public interface FarmacyMedicineService {

    FarmacyMedicine saveFarmacyMedicine(FarmacyMedicine farmacyMedicine);

    FarmacyMedicine updateFarmacyMedicine(FarmacyMedicineId id, FarmacyMedicine farmacyMedicine);

    void deleteFarmacyMedicine(FarmacyMedicineId id);

    List<FarmacyMedicine> findAll();

    Optional<FarmacyMedicine> findById(FarmacyMedicineId id);
}