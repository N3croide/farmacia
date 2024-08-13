package com.necro.farmacia.farmacy.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.farmacy.domain.Farmacy;

/**
 * FarmacyService
 */
public interface FarmacyService {
    Farmacy saveFarmacy(Farmacy farmacy);

    Farmacy updateFarmacy(Long id, Farmacy farmacy);

    void deleteFarmacy(Long id);

    List<Farmacy> findAll();

    Optional<Farmacy> findById(Long id);

}