package com.mohamed.vaccine_management_system.service;

import com.mohamed.vaccine_management_system.entity.Patient;
import com.mohamed.vaccine_management_system.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;

    public Patient savePatient(Patient patient) {
        return repository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    public Patient getPatientById(long id) { return repository.findById(id)
            .orElseThrow(() ->
                    new RuntimeException("Patient not found")); }

    public  Patient updatePatient(Long id, Patient patient ) {
        Patient existingPatient = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Patient not found"));

        if (existingPatient != null) {
            existingPatient.setName(patient.getName());
            existingPatient.setEmail(patient.getEmail());
            existingPatient.setPhone(patient.getPhone());
        }
        return repository.save(existingPatient);
    }
}