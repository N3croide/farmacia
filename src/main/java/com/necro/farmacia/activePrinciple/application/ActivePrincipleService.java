package com.necro.farmacia.activePrinciple.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.activePrinciple.domain.ActivePrinciple;

/**
 * ActivePrincipleService
 */
public interface ActivePrincipleService {

    ActivePrinciple saveActivePrinciple(ActivePrinciple activePrinciple);

    ActivePrinciple updateActivePrinciple(Long id, ActivePrinciple activePrinciple);

    void deleteActivePrinciple(Long id);

    List<ActivePrinciple> findAll();

    Optional<ActivePrinciple> findById(Long id);
}