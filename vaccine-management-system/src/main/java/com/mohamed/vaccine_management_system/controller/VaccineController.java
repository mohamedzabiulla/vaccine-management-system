package com.mohamed.vaccine_management_system.controller;

import com.mohamed.vaccine_management_system.entity.Vaccine;
import com.mohamed.vaccine_management_system.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaccines")
public class VaccineController {

    @Autowired
    private VaccineService service;

    @PostMapping
    public Vaccine addVaccine(@RequestBody Vaccine vaccine) {
        return service.saveVaccine(vaccine);
    }

    @GetMapping
    public List<Vaccine> getVaccines() {
        return service.getAllVaccines();
    }
}