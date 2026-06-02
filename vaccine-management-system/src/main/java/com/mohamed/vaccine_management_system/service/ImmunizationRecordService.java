package com.mohamed.vaccine_management_system.service;

import com.mohamed.vaccine_management_system.entity.ImmunizationRecord;
import com.mohamed.vaccine_management_system.repository.ImmunizationRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImmunizationRecordService {

    @Autowired
    private ImmunizationRecordRepository repository;

    public ImmunizationRecord save(ImmunizationRecord record) {
        return repository.save(record);
    }

    public List<ImmunizationRecord> getAll() {
        return repository.findAll();
    }
}