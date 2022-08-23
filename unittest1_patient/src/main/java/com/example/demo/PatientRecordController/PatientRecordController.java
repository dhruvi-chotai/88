package com.example.demo.PatientRecordController;

import com.example.demo.models.Patient;
import com.example.demo.models.Patient;
import com.example.demo.repositories.PatientRecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientRecordController {


    @Autowired
    PatientRecordRepository patientRecordRepository;

    @GetMapping("/patients") // http://localhost:8080/patients
    public List<Patient> getListOfPatients() {
        return patientRecordRepository.findAll();
    }

    @GetMapping("/patient/{id}")
    public Patient getPatient(@PathVariable Integer id) {
        return patientRecordRepository.findById(id).get();
    }

        @DeleteMapping("/patient/{id}")
        public List<Patient> deletePatient(@PathVariable Integer id) {
            patientRecordRepository.delete(patientRecordRepository.findById(id).get());
            return patientRecordRepository.findAll();
        }

    @PostMapping("/patient")
    public List<Patient> addStudent(@RequestBody Patient patient) {
        patientRecordRepository.save(patient);
        return patientRecordRepository.findAll();
    }

    @PutMapping("/patient/{id}")
    public List<Patient> updateStudent(@RequestBody Patient patient, @PathVariable Integer id) {
        Patient patientObj = patientRecordRepository.findById(id).get();
        patientObj.setName(patient.getName());
        patientObj.setAddress(patient.getAddress());
        patientRecordRepository.save(patientObj);
        return patientRecordRepository.findAll();
    }


}
