package com.necro.farmacia.farmacy.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.farmacy.domain.Farmacy;

/**
 * FarmacyRepository
 */
public interface FarmacyRepository extends JpaRepository<Farmacy, Long> {

}