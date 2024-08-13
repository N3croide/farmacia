package com.necro.farmacia.unitMeasurement.infrastructure.adapters.out;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.necro.farmacia.unitMeasurement.application.UnitMeasurementService;
import com.necro.farmacia.unitMeasurement.domain.UnitMeasurement;

/**
 * UnitMeasurementContoller
 */
@RestController
@RequestMapping("/unitMeasurement")
public class UnitMeasurementContoller {
    @Autowired
    private UnitMeasurementService service;

    @PostMapping("/saveUnitMeasurement")
    public ResponseEntity<UnitMeasurement> saveUnitMeasurement(@RequestBody UnitMeasurement unitMeasurement) {
        service.saveUnitMeasurement(unitMeasurement);
        return ResponseEntity.ok(unitMeasurement);
    }

    @PutMapping("/updateUnitMeasurement/{unitMeasurementId}")
    public ResponseEntity<UnitMeasurement> updateUnitMeasurement(@PathVariable Long unitMeasurementId,
            @RequestBody UnitMeasurement unitMeasurement) {
        service.updateUnitMeasurement(unitMeasurementId, unitMeasurement);
        return ResponseEntity.ok(unitMeasurement);
    }

    @DeleteMapping("/deleteUnitMeasurement/{unitMeasurementId}")
    public ResponseEntity<Long> deleteUnitMeasurement(@PathVariable Long unitMeasurementId) {
        service.deleteUnitMeasurement(unitMeasurementId);
        return ResponseEntity.ok(unitMeasurementId);
    }

    @GetMapping("/allUnitMeasurements")
    public ResponseEntity<List<UnitMeasurement>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getUnitMeasurement/{id}")
    public ResponseEntity<UnitMeasurement> getUnitMeasurementByid(@PathVariable Long id) {
        return ResponseEntity.of(service.findById(id));
    }

}