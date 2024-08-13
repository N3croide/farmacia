package com.necro.farmacia.modeAdministration.infrastructure.adapters.out;

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

import com.necro.farmacia.modeAdministration.application.ModeAdministrationService;
import com.necro.farmacia.modeAdministration.domain.ModeAdministration;

/**
 * ModeAdministrationContoller
 */
@RestController
@RequestMapping("/modeAdministration")
public class ModeAdministrationContoller {
    @Autowired
    private ModeAdministrationService service;

    @PostMapping("/saveModeAdministration")
    public ResponseEntity<ModeAdministration> saveModeAdministration(
            @RequestBody ModeAdministration modeAdministration) {
        service.saveModeAdministration(modeAdministration);
        return ResponseEntity.ok(modeAdministration);
    }

    @PutMapping("/updateModeAdministration/{modeAdministrationId}")
    public ResponseEntity<ModeAdministration> updateModeAdministration(@PathVariable Long modeAdministrationId,
            @RequestBody ModeAdministration modeAdministration) {
        service.updateModeAdministration(modeAdministrationId, modeAdministration);
        return ResponseEntity.ok(modeAdministration);
    }

    @DeleteMapping("/deleteModeAdministration/{modeAdministrationId}")
    public ResponseEntity<Long> deleteModeAdministration(@PathVariable Long modeAdministrationId) {
        service.deleteModeAdministration(modeAdministrationId);
        return ResponseEntity.ok(modeAdministrationId);
    }

    @GetMapping("/allModeAdministrations")
    public ResponseEntity<List<ModeAdministration>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getModeAdministration/{id}")
    public ResponseEntity<ModeAdministration> getModeAdministrationByid(@PathVariable Long id) {
        return ResponseEntity.of(service.findById(id));
    }

}