package com.necro.farmacia.city.domain;

import java.util.List;

import com.necro.farmacia.customer.domain.Customer;
import com.necro.farmacia.farmacy.domain.Farmacy;
import com.necro.farmacia.region.domain.Region;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * City
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;

    @ManyToOne
    private Region region;

    @OneToMany(mappedBy = "city")
    private List<Customer> customers;

    @OneToMany
    private List<Farmacy> farmacies;
}