package com.necro.farmacia.customer.application;

import java.util.List;
import java.util.Optional;

import com.necro.farmacia.customer.domain.Customer;

/**
 * CustomerService
 */
public interface CustomerService {

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(String id, Customer customer);

    void deleteCustomer(String id);

    List<Customer> findAll();

    Optional<Customer> findById(String id);
}