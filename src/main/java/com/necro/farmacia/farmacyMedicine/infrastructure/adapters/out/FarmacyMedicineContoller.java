package com.necro.farmacia.farmacyMedicine.infrastructure.adapters.out;

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

import com.necro.farmacia.farmacyMedicine.application.FarmacyMedicineService;
import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicine;
import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicineId;

/**
 * FarmacyMedicineContoller
 */
@RestController
@RequestMapping("/farmacyMedicine")
public class FarmacyMedicineContoller {
    @Autowired
    private FarmacyMedicineService service;

    @PostMapping("/saveFarmacyMedicine")
    public ResponseEntity<FarmacyMedicine> saveFarmacyMedicine(@RequestBody FarmacyMedicine farmacyMedicine) {
        service.saveFarmacyMedicine(farmacyMedicine);
        return ResponseEntity.ok(farmacyMedicine);
    }

    @PutMapping("/updateFarmacyMedicine/{farmacyMedicineId}")
    public ResponseEntity<FarmacyMedicine> updateFarmacyMedicine(@PathVariable FarmacyMedicineId farmacyMedicineId,
            @RequestBody FarmacyMedicine farmacyMedicine) {
        service.updateFarmacyMedicine(farmacyMedicineId, farmacyMedicine);
        return ResponseEntity.ok(farmacyMedicine);
    }

    @DeleteMapping("/deleteFarmacyMedicine/{farmacyMedicineId}")
    public ResponseEntity<FarmacyMedicineId> deleteFarmacyMedicine(@PathVariable FarmacyMedicineId farmacyMedicineId) {
        service.deleteFarmacyMedicine(farmacyMedicineId);
        return ResponseEntity.ok(farmacyMedicineId);
    }

    @GetMapping("/allFarmacyMedicines")
    public ResponseEntity<List<FarmacyMedicine>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getFarmacyMedicine/{id}")
    public ResponseEntity<FarmacyMedicine> getFarmacyMedicineByid(@PathVariable FarmacyMedicineId id) {
        return ResponseEntity.of(service.findById(id));
    }

}