package com.mohamed.vaccine_management_system.entity;

import jakarta.persistence.*;

@Entity
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vaccineName;
    private String manufacturer;
    private Integer dosesRequired;

    public Vaccine() {
    }

    public Long getId() {
        return id;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getDosesRequired() {
        return dosesRequired;
    }

    public void setDosesRequired(Integer dosesRequired) {
        this.dosesRequired = dosesRequired;
    }
}