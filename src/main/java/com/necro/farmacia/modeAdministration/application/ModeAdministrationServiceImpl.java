package com.necro.farmacia.modeAdministration.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.modeAdministration.domain.ModeAdministration;
import com.necro.farmacia.modeAdministration.infrastructure.adapters.in.ModeAdministrationRepository;

import jakarta.transaction.Transactional;

/**
 * ModeAdministrationServiceImpl
 */
@Service
public class ModeAdministrationServiceImpl implements ModeAdministrationService {
    @Autowired
    private ModeAdministrationRepository modeAdministrationRepository;

    @Transactional
    @Override
    public void deleteModeAdministration(Long id) {
        modeAdministrationRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<ModeAdministration> findAll() {
        return modeAdministrationRepository.findAll();
    }

    @Transactional
    @Override
    public ModeAdministration saveModeAdministration(ModeAdministration modeAdministration) {
        return modeAdministrationRepository.save(modeAdministration);
    }

    @Transactional
    @Override
    public ModeAdministration updateModeAdministration(Long id, ModeAdministration modeAdministration) {
        if (modeAdministrationRepository.existsById(id)) {
            modeAdministration.setId(id);
            return modeAdministrationRepository.save(modeAdministration);
        } else {
            throw new RuntimeException("modeAdministration not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<ModeAdministration> findById(Long id) {
        return modeAdministrationRepository.findById(id);
    }

}