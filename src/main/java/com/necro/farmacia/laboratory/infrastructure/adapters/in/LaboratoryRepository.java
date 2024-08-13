package com.necro.farmacia.laboratory.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.laboratory.domain.Laboratory;

/**
 * LaboratoryRepository
 */
public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {

}