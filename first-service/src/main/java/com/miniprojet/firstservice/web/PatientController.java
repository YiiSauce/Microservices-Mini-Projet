package com.miniprojet.firstservice.web;

import com.example.hospital.entities.Patient;
import com.example.hospital.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PatientController {
    @Autowired
    private PatientsService patientsService;

    @GetMapping(path = "patients")
    public List<Patient> getPatients(){
        return patientsService.getAllPatients();
    }

    @GetMapping("patients/{patientId}")
    public  Patient getPatientById(@PathVariable Long patientId){
        return patientsService.getPatient(patientId);
    }

    @DeleteMapping("patients/{patientId}")
    public void deletePatient(@PathVariable  Long patientId){

        patientsService.DeletePatient(patientId);
    }
    @PostMapping("/patients")
    public Patient savePatient(@RequestBody Patient patient){

        return patientsService.savePatient(patient);
    }

    @PutMapping("patients/{patientId}")
    public Patient updatePatient( @PathVariable Long patientId, @RequestBody Patient patient) {
        return patientsService.updatePatient(patient);
    }


}
