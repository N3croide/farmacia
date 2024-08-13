package com.necro.farmacia.modeAdministration.domain;

import java.util.List;

import com.necro.farmacia.medicine.domain.Medicine;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ModeAdministration
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ModeAdministration {

    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "codeModeAdmin")
    private List<Medicine> medicines;

}