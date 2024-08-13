package com.necro.farmacia.country.infrastructure.adapters.out;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.necro.farmacia.country.application.CountryService;
import com.necro.farmacia.country.domain.Country;

/**
 * CountryContoller
 */

@RestController
public class CountryContoller {
    @Autowired
    private CountryService service;

    @PostMapping("/saveCountry")
    public ResponseEntity<Country> saveCountry(@RequestBody Country country) {
        service.saveCountry(country);
        return ResponseEntity.ok(country);
    }

    @PutMapping("/updateCountry/{countryId}")
    public ResponseEntity<Country> updateCountry(@PathVariable Long countryId, @RequestBody Country country) {
        service.updateCountry(countryId, country);
        return ResponseEntity.ok(country);
    }

    @DeleteMapping("/deleteCountry/{countryId}")
    public ResponseEntity<Long> deleteCountry(@PathVariable Long countryId) {
        service.deleteCountry(countryId);
        return ResponseEntity.ok(countryId);
    }

    @GetMapping("/allCountries")
    public ResponseEntity<List<Country>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getCountry/{id}")
    public ResponseEntity<Country> getCountryByid(@PathVariable Long id) {
        return ResponseEntity.of(service.findById(id));
    }

}