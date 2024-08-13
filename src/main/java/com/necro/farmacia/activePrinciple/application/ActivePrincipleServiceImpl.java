package com.necro.farmacia.activePrinciple.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.activePrinciple.domain.ActivePrinciple;
import com.necro.farmacia.activePrinciple.infrastructure.adapters.in.ActivePrincipleRepository;

import jakarta.transaction.Transactional;

/**
 * ActivePrincipleServiceImpl
 */
@Service
public class ActivePrincipleServiceImpl implements ActivePrincipleService {
    @Autowired
    private ActivePrincipleRepository activePrincipleRepository;

    @Transactional
    @Override
    public void deleteActivePrinciple(Long id) {
        activePrincipleRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<ActivePrinciple> findAll() {
        return activePrincipleRepository.findAll();
    }

    @Transactional
    @Override
    public ActivePrinciple saveActivePrinciple(ActivePrinciple activePrinciple) {
        return activePrincipleRepository.save(activePrinciple);
    }

    @Transactional
    @Override
    public ActivePrinciple updateActivePrinciple(Long id, ActivePrinciple activePrinciple) {
        if (activePrincipleRepository.existsById(id)) {
            activePrinciple.setId(id);
            return activePrincipleRepository.save(activePrinciple);
        } else {
            throw new RuntimeException("activePrinciple not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<ActivePrinciple> findById(Long id) {
        return activePrincipleRepository.findById(id);
    }

}