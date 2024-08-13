package com.necro.farmacia.region.domain;

import java.util.List;

import com.necro.farmacia.city.domain.City;
import com.necro.farmacia.country.domain.Country;

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
 * Region
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @ManyToOne
    private Country country;

    @OneToMany(mappedBy = "region")
    private List<City> cities;
}