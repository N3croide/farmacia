package com.necro.farmacia.medicine.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.medicine.domain.Medicine;

/**
 * MedicineService
 */
public interface MedicineService {
    Medicine saveMedicine(Medicine medicine);

    Medicine updateMedicine(Long id, Medicine medicine);

    void deleteMedicine(Long id);

    List<Medicine> findAll();

    Optional<Medicine> findById(Long id);

}