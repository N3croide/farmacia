package com.necro.farmacia.medicine.infrastructure.adapters.out;

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

import com.necro.farmacia.medicine.application.MedicineService;
import com.necro.farmacia.medicine.domain.Medicine;

/**
 * MedicineContoller
 */
@RestController
@RequestMapping("/medicine")
public class MedicineContoller {
    @Autowired
    private MedicineService service;

    @PostMapping("/saveMedicine")
    public ResponseEntity<Medicine> saveMedicine(@RequestBody Medicine medicine) {
        service.saveMedicine(medicine);
        return ResponseEntity.ok(medicine);
    }

    @PutMapping("/updateMedicine/{medicineId}")
    public ResponseEntity<Medicine> updateMedicine(@PathVariable Long medicineId, @RequestBody Medicine medicine) {
        service.updateMedicine(medicineId, medicine);
        return ResponseEntity.ok(medicine);
    }

    @DeleteMapping("/deleteMedicine/{medicineId}")
    public ResponseEntity<Long> deleteMedicine(@PathVariable Long medicineId) {
        service.deleteMedicine(medicineId);
        return ResponseEntity.ok(medicineId);
    }

    @GetMapping("/allMedicines")
    public ResponseEntity<List<Medicine>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getMedicine/{id}")
    public ResponseEntity<Medicine> getMedicineByid(@PathVariable Long id) {
        return ResponseEntity.of(service.findById(id));
    }

}