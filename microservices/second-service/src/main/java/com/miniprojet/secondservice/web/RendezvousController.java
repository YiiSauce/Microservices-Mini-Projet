package com.miniprojet.secondservice.web;

import com.miniprojet.secondservice.client.FirstServiceRestClient;
import com.miniprojet.secondservice.entities.Consultation;
import com.miniprojet.secondservice.entities.RendezVous;
import com.miniprojet.secondservice.model.Medecin;
import com.miniprojet.secondservice.model.Patient;
import com.miniprojet.secondservice.repositories.ConsultationRepository;
import com.miniprojet.secondservice.repositories.RendezvousRepository;
import com.miniprojet.secondservice.services.RendezvousService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RendezvousController {
    private RendezvousService rendezvousService;

    //READ
    @GetMapping(path = "rendezVous")
    public List<RendezVous> getRendezVous(){
        return rendezvousService.getAllRendezVous() ;
    }

    //READ BY ID
    @GetMapping("rendezVous/{rendezVousId}")
    public RendezVous getRendezvousById(@PathVariable Long rendezVousId){
        return rendezvousService.getRendezVous(rendezVousId);
    }

    //DELETE
    @DeleteMapping("rendezVous/{rendezVousId}")
    public void deleteRendezVous(@PathVariable  Long rendezVousId){
        rendezvousService.deleteRendezVous(rendezVousId);
    }
    //CREATE
    @PostMapping("/rendezVous")
    public RendezVous saveRendezVous(@RequestBody RendezVous rendezVous){
        return rendezvousService.saveRendezVous(rendezVous);
    }
    //UPDATE
    @PutMapping("rendezVous/{rendezVousId}")
    public  RendezVous updateRendezvous( @PathVariable Long rendezVousId, @RequestBody RendezVous rendezVous) {
        return rendezvousService.updateRendezVous(rendezVous);
    }
}
