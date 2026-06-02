package com.mohamed.vaccine_management_system.repository;

import com.mohamed.vaccine_management_system.entity.ImmunizationRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImmunizationRecordRepository
        extends JpaRepository<ImmunizationRecord, Long> {
}