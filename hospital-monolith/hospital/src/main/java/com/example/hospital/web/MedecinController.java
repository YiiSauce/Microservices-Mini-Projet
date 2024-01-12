package com.example.hospital.web;

import com.example.hospital.entities.Medecin;
import com.example.hospital.entities.Patient;
import com.example.hospital.service.MedecinService;
import com.example.hospital.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedecinController {
    @Autowired
    private MedecinService medecinService;

    @GetMapping(path = "medecins")
    public List<Medecin> getMedecins(){
        return medecinService.getAllMedecins();
    }

    @GetMapping("medecins/{medecinId}")
    public  Medecin getMedecinById(@PathVariable Long medecinId){
        return medecinService.getMedecin(medecinId);
    }

    @DeleteMapping("medecins/{medecinId}")
    public void deleteMedecin(@PathVariable  Long medecinId){

        medecinService.DeleteMedecin(medecinId);
    }
    @PostMapping("/medecins")
    public Medecin saveMedecin(@RequestBody Medecin medecin){

        return medecinService.saveMedecin(medecin);
    }

    @PutMapping("medecins/{medecinId}")
    public  Medecin updateMedecin( @PathVariable Long medecinId, @RequestBody Medecin medecin) {
        return medecinService.updateMedecin(medecin);
    }
}
