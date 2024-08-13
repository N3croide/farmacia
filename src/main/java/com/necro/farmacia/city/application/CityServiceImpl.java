package com.necro.farmacia.city.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.city.domain.City;
import com.necro.farmacia.city.infrastructure.adapters.in.CityRepository;

import jakarta.transaction.Transactional;

/**
 * CityServiceImpl
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Transactional
    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Transactional
    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Transactional
    @Override
    public City updateCity(Long id, City city) {
        if (cityRepository.existsById(id)) {
            city.setId(id);
            return cityRepository.save(city);
        } else {
            throw new RuntimeException("city not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

}