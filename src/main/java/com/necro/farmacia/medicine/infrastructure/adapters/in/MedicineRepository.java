package com.necro.farmacia.medicine.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.medicine.domain.Medicine;

/**
 * MedicineRepository
 */
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}