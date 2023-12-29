package com.miniprojet.secondservice.web;

import com.miniprojet.secondservice.entities.Consultation;
import com.miniprojet.secondservice.services.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConsultationController {
    @Autowired
    private ConsultationService consultationService;
    @GetMapping(path = "consultations")
    public List<Consultation> getConsultations(){
        return consultationService.getAllConsultations();
    }

    @GetMapping("consultations/{consultationId}")
    public Consultation getConsultationById(@PathVariable Long consultationId){
        return consultationService.getConsultation(consultationId);
    }

    @DeleteMapping("consultations/{consultationId}")
    public void deleteConsultation(@PathVariable  Long consultationId){

        consultationService.DeleteConsultation(consultationId);
    }
    @PostMapping("/consultations")
    public Consultation saveConsultation(@RequestBody Consultation consultation){

        return consultationService.saveConsultation(consultation);
    }

    @PutMapping("consultations/{consultationId}")
    public  Consultation updateConsultation( @PathVariable Long consultationId, @RequestBody Consultation consultation) {
        return consultationService.updateConsultation(consultation);
    }
}
