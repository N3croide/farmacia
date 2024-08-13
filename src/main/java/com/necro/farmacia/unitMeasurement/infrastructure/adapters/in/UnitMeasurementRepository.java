package com.necro.farmacia.unitMeasurement.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.unitMeasurement.domain.UnitMeasurement;

/**
 * UnitMeasurementRepository
 */
public interface UnitMeasurementRepository extends JpaRepository<UnitMeasurement, Long> {

}