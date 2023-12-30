package com.miniprojet.secondservice.client;

import com.miniprojet.secondservice.model.Medecin;
import com.miniprojet.secondservice.model.Patient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface PatientRestClient {
    @GetMapping("patients/{id}")
    @CircuitBreaker(name = "patientsService",fallbackMethod = "getDefaultPatient")
    Patient getPatientById(@PathVariable Long id);
    default Patient getDefaultCustomer(Long id, Exception exception){
        Patient patient=new Patient();
        patient.setId(id);
        patient.setNom("not available");
        patient.setMalade(true);
        return patient;
    }
}
