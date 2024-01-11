package com.miniprojet.secondservice.client;

import com.miniprojet.secondservice.model.Medecin;
import com.miniprojet.secondservice.model.Patient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "FIRST-SERVICE")
public interface FirstServiceRestClient {
    @GetMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable Long id);
    @GetMapping("/patients")
    public List<Patient> getPatients();
    @GetMapping("/medecins/{id}")
    public Medecin getMedecinById(@PathVariable Long id);
    @GetMapping("/medecins")
    public List<Medecin> getMedecins();
}
