package com.example.demo.repositories;

import com.example.demo.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository extends JpaRepository<Patient, Integer> {
}
