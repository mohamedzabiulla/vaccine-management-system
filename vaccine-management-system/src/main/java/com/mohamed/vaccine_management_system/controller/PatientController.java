package com.mohamed.vaccine_management_system.controller;

import com.mohamed.vaccine_management_system.entity.Patient;
import com.mohamed.vaccine_management_system.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping
    public Patient addPatient(@Valid @RequestBody Patient patient) {
        return service.savePatient(patient);
    }


    @GetMapping
    public List<Patient> getPatients() {
        return service.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable long id) {return service.getPatientById(id);}

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable long id, @RequestBody Patient patient) {
        return service.updatePatient(id, patient);
    }
}