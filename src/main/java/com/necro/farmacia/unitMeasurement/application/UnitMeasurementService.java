package com.necro.farmacia.unitMeasurement.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.unitMeasurement.domain.UnitMeasurement;

/**
 * UnitMeasurementService
 */
public interface UnitMeasurementService {

    UnitMeasurement saveUnitMeasurement(UnitMeasurement unitMeasurement);

    UnitMeasurement updateUnitMeasurement(Long id, UnitMeasurement unitMeasurement);

    void deleteUnitMeasurement(Long id);

    List<UnitMeasurement> findAll();

    Optional<UnitMeasurement> findById(Long id);
}