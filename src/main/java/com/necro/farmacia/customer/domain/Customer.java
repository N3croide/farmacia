package com.necro.farmacia.customer.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Customer
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private String id;

    private String nameCustoer;
    private String lastNameCustomer;
    private String emailCustomer;
    private Date birthDate;
    private Float longCustomer;
    private Float latitudCustomer;

    @ManyToOne
    private Long city;

}