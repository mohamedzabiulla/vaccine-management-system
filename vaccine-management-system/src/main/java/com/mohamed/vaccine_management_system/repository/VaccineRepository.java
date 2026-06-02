package com.mohamed.vaccine_management_system.repository;

import com.mohamed.vaccine_management_system.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {
}