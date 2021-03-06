package com.microservice.customer.domain.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Long creditId;

    @NotNull
    private String firstName;

    @NotNull
    private String surname;

    @NotNull
    private String pesel;

}
