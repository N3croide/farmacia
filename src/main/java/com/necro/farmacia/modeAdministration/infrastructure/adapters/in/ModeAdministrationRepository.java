package com.necro.farmacia.modeAdministration.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.modeAdministration.domain.ModeAdministration;

/**
 * ModeAdministrationRepository
 */
public interface ModeAdministrationRepository extends JpaRepository<ModeAdministration, Long> {

}