package com.necro.farmacia.activePrinciple.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.activePrinciple.domain.ActivePrinciple;

/**
 * ActivePrincipleRepository
 */
public interface ActivePrincipleRepository extends JpaRepository<ActivePrinciple, Long> {

}