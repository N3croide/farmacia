package com.necro.farmacia.laboratory.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.laboratory.domain.Laboratory;

/**
 * LaboratoryService
 */
public interface LaboratoryService {
    Laboratory saveLaboratory(Laboratory entity);

    Laboratory updateLaboratory(Long id, Laboratory entity);

    void deleteLaboratory(Long id);

    List<Laboratory> findAll();

    Optional<Laboratory> findById(Long id);

}