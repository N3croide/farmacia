package com.necro.farmacia.unitMeasurement.domain;

import java.util.List;

import com.necro.farmacia.medicine.domain.Medicine;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UnitMeasurement
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UnitMeasurement {
    @Id
    private Long id;

    private String descriptionMode;

    @OneToMany(mappedBy = "codeUm")
    private List<Medicine> medicines;
}