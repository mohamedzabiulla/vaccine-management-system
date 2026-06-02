package com.mohamed.vaccine_management_system.controller;

import com.mohamed.vaccine_management_system.entity.ImmunizationRecord;
import com.mohamed.vaccine_management_system.service.ImmunizationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
public class ImmunizationRecordController {

    @Autowired
    private ImmunizationRecordService service;

    @PostMapping
    public ImmunizationRecord save(
            @RequestBody ImmunizationRecord record) {

        return service.save(record);
    }

    @GetMapping
    public List<ImmunizationRecord> getAll() {
        return service.getAll();
    }
}