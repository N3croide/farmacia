package com.necro.farmacia.laboratory.infrastructure.adapters.out;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.necro.farmacia.laboratory.application.LaboratoryService;
import com.necro.farmacia.laboratory.domain.Laboratory;

/**
 * LaboratoryContoller
 */
public class LaboratoryContoller {

    @Autowired
    private LaboratoryService service;

    @PostMapping("/saveLaboratory")
    public ResponseEntity<Laboratory> saveLaboratory(@RequestBody Laboratory laboratory) {
        service.saveLaboratory(laboratory);
        return ResponseEntity.ok(laboratory);
    }

    @PutMapping("/updateLaboratory/{laboratoryId}")
    public ResponseEntity<Laboratory> updateLaboratory(@PathVariable Long laboratoryId,
            @RequestBody Laboratory laboratory) {
        service.updateLaboratory(laboratoryId, laboratory);
        return ResponseEntity.ok(laboratory);
    }

    @DeleteMapping("/deleteLaboratory/{laboratoryId}")
    public ResponseEntity<Long> deleteLaboratory(@PathVariable Long laboratoryId) {
        service.deleteLaboratory(laboratoryId);
        return ResponseEntity.ok(laboratoryId);
    }

    @GetMapping("/allLaboratories")
    public ResponseEntity<List<Laboratory>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getLaboratory/{id}")
    public ResponseEntity<Laboratory> getLaboratoryByid(@PathVariable Long id) {
        return ResponseEntity.of(service.findById(id));
    }
}