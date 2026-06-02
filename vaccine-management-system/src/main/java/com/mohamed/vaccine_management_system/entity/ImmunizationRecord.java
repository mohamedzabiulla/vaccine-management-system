package com.mohamed.vaccine_management_system.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class ImmunizationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate administeredDate;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Vaccine vaccine;

    public ImmunizationRecord() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getAdministeredDate() {
        return administeredDate;
    }

    public void setAdministeredDate(LocalDate administeredDate) {
        this.administeredDate = administeredDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
}