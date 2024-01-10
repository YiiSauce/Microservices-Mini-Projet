package com.miniprojet.firstservice.web;

import com.miniprojet.firstservice.entities.Patient;
import com.miniprojet.firstservice.service.PatientsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@RequiredArgsConstructor
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
