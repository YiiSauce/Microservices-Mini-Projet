package com.miniprojet.secondservice.web;

import com.miniprojet.secondservice.client.FirstServiceRestClient;
import com.miniprojet.secondservice.entities.Consultation;
import com.miniprojet.secondservice.entities.RendezVous;
import com.miniprojet.secondservice.model.Medecin;
import com.miniprojet.secondservice.model.Patient;
import com.miniprojet.secondservice.repositories.ConsultationRepository;
import com.miniprojet.secondservice.repositories.RendezvousRepository;
import com.miniprojet.secondservice.services.RendezvousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequiredArgsConstructor
public class RendezvousController {
    @Autowired
    private RendezvousService rendezvousService;
    @Autowired
    private ConsultationRepository consultationRepository;
//    @Autowired
//    private MedecinRestClient medecinRestClient;
    @Autowired
    private RendezvousRepository rendezvousRepository;
    @Autowired
    private FirstServiceRestClient firstServiceRestClient;

    //READ
    @GetMapping(path = "rendezVous")
    public List<RendezVous> getRendezVous(){
        return rendezvousService.getAllRendezVous() ;
    }

    //READ BY ID
    @GetMapping("rendezVous/{rendezVousId}")
    public RendezVous getRendezvousById(@PathVariable Long rendezVousId){
        RendezVous rendezVous = rendezvousService.getRendezVous(rendezVousId);
        Medecin medecin = firstServiceRestClient.getMedecinById(rendezVous.getMedecinId());
        Patient patient = firstServiceRestClient.getPatientById(rendezVous.getPatientId());
        rendezVous.setMedecin(medecin);
        rendezVous.setPatient(patient);
        return rendezVous;
    }

    //DELETE
    @DeleteMapping("rendezVous/{rendezVousId}")
    public void deleteRendezVous(@PathVariable  Long rendezVousId){
        RendezVous rendezVous = rendezvousRepository.findById(rendezVousId).orElse(null);
        if (rendezVous != null) {
            Consultation consultation = rendezVous.getConsultation();
            if (consultation != null) {
                consultationRepository.deleteById(consultation.getId());
            }
            rendezvousRepository.deleteById(rendezVousId);
        }
    }
    //CREATE
    @PostMapping("/rendezVous")
    public RendezVous saveRendezVous(@RequestBody RendezVous rendezVous){
        consultationRepository.save(rendezVous.getConsultation());
        return rendezvousService.saveRendezVous(rendezVous);
    }
    //UPDATE
    @PutMapping("rendezVous/{rendezVousId}")
    public  RendezVous updateRendezvous( @PathVariable Long rendezVousId, @RequestBody RendezVous rendezVous) {
        return rendezvousService.updateRendezVous(rendezVous);
    }
}
