package com.mohamed.vaccine_management_system.service;

import com.mohamed.vaccine_management_system.entity.Vaccine;
import com.mohamed.vaccine_management_system.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService {

    @Autowired
    private VaccineRepository repository;

    public Vaccine saveVaccine(Vaccine vaccine) {
        return repository.save(vaccine);
    }

    public List<Vaccine> getAllVaccines() {
        return repository.findAll();
    }
}