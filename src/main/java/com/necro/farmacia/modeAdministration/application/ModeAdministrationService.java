package com.necro.farmacia.modeAdministration.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.modeAdministration.domain.ModeAdministration;

/**
 * ModeAdministrationService
 */
public interface ModeAdministrationService {

    ModeAdministration saveModeAdministration(ModeAdministration modeAdministration);

    ModeAdministration updateModeAdministration(Long id, ModeAdministration modeAdministration);

    void deleteModeAdministration(Long id);

    List<ModeAdministration> findAll();

    Optional<ModeAdministration> findById(Long id);
}