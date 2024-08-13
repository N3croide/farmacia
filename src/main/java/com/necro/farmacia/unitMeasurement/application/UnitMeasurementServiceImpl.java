package com.necro.farmacia.unitMeasurement.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.unitMeasurement.domain.UnitMeasurement;
import com.necro.farmacia.unitMeasurement.infrastructure.adapters.in.UnitMeasurementRepository;

import jakarta.transaction.Transactional;

/**
 * UnitMeasurementServiceImpl
 */
@Service
public class UnitMeasurementServiceImpl implements UnitMeasurementService {
    @Autowired
    private UnitMeasurementRepository unitMeasurementRepository;

    @Transactional
    @Override
    public void deleteUnitMeasurement(Long id) {
        unitMeasurementRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<UnitMeasurement> findAll() {
        return unitMeasurementRepository.findAll();
    }

    @Transactional
    @Override
    public UnitMeasurement saveUnitMeasurement(UnitMeasurement unitMeasurement) {
        return unitMeasurementRepository.save(unitMeasurement);
    }

    @Transactional
    @Override
    public UnitMeasurement updateUnitMeasurement(Long id, UnitMeasurement unitMeasurement) {
        if (unitMeasurementRepository.existsById(id)) {
            unitMeasurement.setId(id);
            return unitMeasurementRepository.save(unitMeasurement);
        } else {
            throw new RuntimeException("unitMeasurement not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<UnitMeasurement> findById(Long id) {
        return unitMeasurementRepository.findById(id);
    }

}