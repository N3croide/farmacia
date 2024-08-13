package com.necro.farmacia.medicine.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.medicine.domain.Medicine;
import com.necro.farmacia.medicine.infrastructure.adapters.in.MedicineRepository;

import jakarta.transaction.Transactional;

/**
 * MedicineServiceImpl
 */
@Service
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    private MedicineRepository medicineRepository;

    @Transactional
    @Override
    public void deleteMedicine(Long id) {
        medicineRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Medicine> findAll() {
        return medicineRepository.findAll();
    }

    @Transactional
    @Override
    public Medicine saveMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Transactional
    @Override
    public Medicine updateMedicine(Long id, Medicine medicine) {
        if (medicineRepository.existsById(id)) {
            medicine.setId(id);
            return medicineRepository.save(medicine);
        } else {
            throw new RuntimeException("medicine not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<Medicine> findById(Long id) {
        return medicineRepository.findById(id);
    }

}