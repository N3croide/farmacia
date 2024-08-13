package com.necro.farmacia.laboratory.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.laboratory.domain.Laboratory;
import com.necro.farmacia.laboratory.infrastructure.adapters.in.LaboratoryRepository;

import jakarta.transaction.Transactional;

/**
 * LaboratoryServiceImpl
 */
@Service
public class LaboratoryServiceImpl implements LaboratoryService {

    @Autowired
    private LaboratoryRepository laboratoryRepository;

    @Transactional
    @Override
    public void deleteLaboratory(Long id) {
        laboratoryRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Laboratory> findAll() {
        return laboratoryRepository.findAll();
    }

    @Transactional
    @Override
    public Laboratory saveLaboratory(Laboratory laboratory) {
        return laboratoryRepository.save(laboratory);
    }

    @Transactional
    @Override
    public Laboratory updateLaboratory(Long id, Laboratory laboratory) {
        if (laboratoryRepository.existsById(id)) {
            laboratory.setId(id);
            return laboratoryRepository.save(laboratory);
        } else {
            throw new RuntimeException("laboratory not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<Laboratory> findById(Long id) {
        return laboratoryRepository.findById(id);
    }
}