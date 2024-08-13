package com.necro.farmacia.customer.infrastructure.adapters.in;

import org.springframework.data.jpa.repository.JpaRepository;

import com.necro.farmacia.customer.domain.Customer;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends JpaRepository<Customer, String> {

}