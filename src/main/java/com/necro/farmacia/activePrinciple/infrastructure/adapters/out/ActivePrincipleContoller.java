package com.necro.farmacia.activePrinciple.infrastructure.adapters.out;

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

import com.necro.farmacia.activePrinciple.application.ActivePrincipleService;
import com.necro.farmacia.activePrinciple.domain.ActivePrinciple;

/**
 * ActivePrincipleContoller
 */
@RestController
@RequestMapping("/activePrinciple")
public class ActivePrincipleContoller {
    @Autowired
    private ActivePrincipleService service;

    @PostMapping("/saveActivePrinciple")
    public ResponseEntity<ActivePrinciple> saveActivePrinciple(@RequestBody ActivePrinciple activePrinciple) {
        service.saveActivePrinciple(activePrinciple);
        return ResponseEntity.ok(activePrinciple);
    }

    @PutMapping("/updateActivePrinciple/{activePrincipleId}")
    public ResponseEntity<ActivePrinciple> updateActivePrinciple(@PathVariable Long activePrincipleId,
            @RequestBody ActivePrinciple activePrinciple) {
        service.updateActivePrinciple(activePrincipleId, activePrinciple);
        return ResponseEntity.ok(activePrinciple);
    }

    @DeleteMapping("/deleteActivePrinciple/{activePrincipleId}")
    public ResponseEntity<Long> deleteActivePrinciple(@PathVariable Long activePrincipleId) {
        service.deleteActivePrinciple(activePrincipleId);
        return ResponseEntity.ok(activePrincipleId);
    }

    @GetMapping("/allActivePrinciples")
    public ResponseEntity<List<ActivePrinciple>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getActivePrinciple/{id}")
    public ResponseEntity<ActivePrinciple> getActivePrincipleByid(@PathVariable Long id) {
        return ResponseEntity.of(service.findById(id));
    }
}