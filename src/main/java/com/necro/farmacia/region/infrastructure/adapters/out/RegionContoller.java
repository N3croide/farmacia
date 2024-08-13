package com.necro.farmacia.region.infrastructure.adapters.out;

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

import com.necro.farmacia.region.application.RegionService;
import com.necro.farmacia.region.domain.Region;

/**
 * RegionContoller
 */
@RestController
@RequestMapping("/region")
public class RegionContoller {

    @Autowired
    private RegionService service;

    @PostMapping("/saveRegion")
    public ResponseEntity<Region> saveRegion(@RequestBody Region region) {
        service.saveRegion(region);
        return ResponseEntity.ok(region);
    }

    @PutMapping("/updateRegion/{regionId}")
    public ResponseEntity<Region> updateRegion(@PathVariable Long regionId, @RequestBody Region region) {
        service.updateRegion(regionId, region);
        return ResponseEntity.ok(region);
    }

    @DeleteMapping("/deleteRegion/{regionId}")
    public ResponseEntity<Long> deleteRegion(@PathVariable Long regionId) {
        service.deleteRegion(regionId);
        return ResponseEntity.ok(regionId);
    }

    @GetMapping("/allRegions")
    public ResponseEntity<List<Region>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getRegion/{id}")
    public ResponseEntity<Region> getRegionByid(@PathVariable Long id) {
        return ResponseEntity.of(service.findById(id));
    }
}