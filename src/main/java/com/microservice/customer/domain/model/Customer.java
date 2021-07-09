package com.microservice.customer.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private Long customerId;

    @NotNull
    private String firstName;

    @NotNull
    private String surname;

    @NotNull
    private String pesel;

    public Customer() {
    }

    public Customer(Long customerId, String firstName, String surname, String pesel) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.surname = surname;
        this.pesel = pesel;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
