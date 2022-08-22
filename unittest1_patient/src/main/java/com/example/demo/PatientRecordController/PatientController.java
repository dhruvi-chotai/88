package com.example.demo.PatientRecordController;

import com.example.demo.models.Patient;
import com.example.demo.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {


    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/patients") // http://localhost:8080/patients
    public List<Patient> getListOfPatients() {
        return patientRepository.findAll();
    }

    @GetMapping("/patient/{id}")
    public Patient getPatient(@PathVariable Integer id) {
        return PatientRepository.findById(id).get();\
    }

        @DeleteMapping("/patient/{id}")
        public List<Patient> deletePatient(@PathVariable Integer id) {
            PatientRepository.delete(patientRepository.findById(id).get());
            return patientRepository.findAll();
        }

    @PostMapping("/patient")
    public List<Patient> addStudent(@RequestBody Patient patient) {
        patientRepository.save(patient);
        return patientRepository.findAll();
    }

    @PutMapping("/patient/{id}")
    public List<Patient> updateStudent(@RequestBody Patient patient, @PathVariable Integer id) {
        Patient studentObj = patientRepository.findById(id).get();
        studentObj.setName(patient.getName());
        studentObj.setAddress(patient.getAddress());
        patientRepository.save(studentObj);
        return patientRepository.findAll();
    }


}
