package com.necro.farmacia.laboratory.domain;

import java.util.List;

import com.necro.farmacia.city.domain.City;
import com.necro.farmacia.medicine.domain.Medicine;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Laboratory
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Laboratory {

    @Id
    private Long id;
    private String name;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "laboratory")
    private List<Medicine> medicines;
}