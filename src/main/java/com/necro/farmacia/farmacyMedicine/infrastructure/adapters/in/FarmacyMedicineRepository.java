package com.necro.farmacia.farmacyMedicine.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicine;
import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicineId;

/**
 * FarmacyMedicineRepository
 */
public interface FarmacyMedicineRepository extends JpaRepository<FarmacyMedicine, FarmacyMedicineId> {

}