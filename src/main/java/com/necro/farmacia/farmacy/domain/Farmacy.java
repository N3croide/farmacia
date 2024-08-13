package com.necro.farmacia.farmacy.domain;

import java.util.List;

import com.necro.farmacia.city.domain.City;
import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicine;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Farmacy
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Farmacy {

    @Id
    private Long id;

    private String nameFarmacy;
    private String addressFarmacy;
    private Float longFarmacy;
    private Float latFarmacy;
    private String logoFarmacy;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "farmacy")
    private List<FarmacyMedicine> farmacyMedicine;
}