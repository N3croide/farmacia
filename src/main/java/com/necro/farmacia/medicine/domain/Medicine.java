package com.necro.farmacia.medicine.domain;

import java.util.List;

import com.necro.farmacia.activePrinciple.domain.ActivePrinciple;
import com.necro.farmacia.farmacyMedicine.domain.FarmacyMedicine;
import com.necro.farmacia.laboratory.domain.Laboratory;
import com.necro.farmacia.modeAdministration.domain.ModeAdministration;
import com.necro.farmacia.unitMeasurement.domain.UnitMeasurement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Medicine
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {

    @Id
    private Long id;

    private String proceedings;
    private String nameMedicine;
    private String healthRegister;
    private String description;
    private String descriptinoShort;
    private Integer nameRol;

    @ManyToOne
    private ModeAdministration codeModeAdmin;

    @ManyToOne
    private ActivePrinciple codeAp;

    @ManyToOne
    private UnitMeasurement codeUm;

    @ManyToOne
    private Laboratory laboratory;

    @OneToMany(mappedBy = "medicine")
    private List<FarmacyMedicine> farmacyMedicines;
}