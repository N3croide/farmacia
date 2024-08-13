package com.necro.farmacia.customer.infrastructure.adapters.out;

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

import com.necro.farmacia.customer.application.CustomerService;
import com.necro.farmacia.customer.domain.Customer;

/**
 * CustomerContoller
 */
@RestController
@RequestMapping("/customer")
public class CustomerContoller {

    @Autowired
    private CustomerService service;

    @PostMapping("/saveCustomer")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        service.saveCustomer(customer);
        return ResponseEntity.ok(customer);
    }

    @PutMapping("/updateCustomer/{customerId}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String customerId, @RequestBody Customer customer) {
        service.updateCustomer(customerId, customer);
        return ResponseEntity.ok(customer);
    }

    @DeleteMapping("/deleteCustomer/{customerId}")
    public ResponseEntity<String> deleteCustomer(@PathVariable String customerId) {
        service.deleteCustomer(customerId);
        return ResponseEntity.ok(customerId);
    }

    @GetMapping("/allCustomers")
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/getCustomer/{id}")
    public ResponseEntity<Customer> getCustomerByid(@PathVariable String id) {
        return ResponseEntity.of(service.findById(id));
    }
}