package com.necro.farmacia.customer.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.necro.farmacia.customer.domain.Customer;
import com.necro.farmacia.customer.infrastructure.adapters.in.CustomerRepository;

import jakarta.transaction.Transactional;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository cusomerRepository;

    @Transactional
    @Override
    public void deleteCustomer(String id) {
        cusomerRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Customer> findAll() {
        return cusomerRepository.findAll();
    }

    @Transactional
    @Override
    public Customer saveCustomer(Customer cusomer) {
        return cusomerRepository.save(cusomer);
    }

    @Transactional
    @Override
    public Customer updateCustomer(String id, Customer cusomer) {
        if (cusomerRepository.existsById(id)) {
            cusomer.setId(id);
            return cusomerRepository.save(cusomer);
        } else {
            throw new RuntimeException("cusomer not found with id: " + id);
        }
    }

    @Transactional
    @Override
    public Optional<Customer> findById(String id) {
        return cusomerRepository.findById(id);
    }
}