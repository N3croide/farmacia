package com.necro.farmacia.farmacyMedicine.domain;

import com.necro.farmacia.farmacy.domain.Farmacy;
import com.necro.farmacia.medicine.domain.Medicine;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FarmacyMedicine
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FarmacyMedicine {

    @EmbeddedId
    private FarmacyMedicineId id;

    private Float price;

    @ManyToOne
    private Farmacy farmacy;

    @ManyToOne
    private Medicine medicine;
}