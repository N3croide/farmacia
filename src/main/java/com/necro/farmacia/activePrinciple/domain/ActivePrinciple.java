package com.necro.farmacia.activePrinciple.domain;

import java.util.List;

import com.necro.farmacia.medicine.domain.Medicine;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ActivePrinciple
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ActivePrinciple {

    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "codeAp")
    private List<Medicine> medicines;

}