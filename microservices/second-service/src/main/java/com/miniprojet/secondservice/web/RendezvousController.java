package com.miniprojet.secondservice.web;

import com.miniprojet.secondservice.client.MedecinRestClient;
import com.miniprojet.secondservice.entities.RendezVous;
import com.miniprojet.secondservice.model.Medecin;
import com.miniprojet.secondservice.services.RendezvousService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequiredArgsConstructor
public class RendezvousController {
    @Autowired
    private RendezvousService rendezvousService;
    @Autowired
    private MedecinRestClient medecinRestClient;

    @GetMapping(path = "rendezVous")
    public List<RendezVous> getRendezVous(){
        return rendezvousService.getAllRendezVous() ;
    }

    @GetMapping("rendezVous/{rendezVousId}")
    public  RendezVous getRendezvousById(@PathVariable Long rendezVousId){
        RendezVous rendezVous = rendezvousService.getRendezVous(rendezVousId);
        Medecin medecin = medecinRestClient.getMedecinById(rendezVous.getMedecinId());
        rendezVous.setMedecin(medecin);
        return rendezVous;
    }

    @DeleteMapping("rendezVous/{rendezVousId}")
    public void deleteRendezVous(@PathVariable  Long rendezVousId){
        rendezvousService.DeleteRendezVous(rendezVousId);
    }
    @PostMapping("/rendezVous")
    public RendezVous saveRendezVous(@RequestBody RendezVous rendezVous){

        return rendezvousService.saveRendezVous(rendezVous);
    }

    @PutMapping("rendezVous/{rendezVousId}")
    public  RendezVous updateRendezvous( @PathVariable Long rendezVousId, @RequestBody RendezVous rendezVous) {
        return rendezvousService.updateRendezVous(rendezVous);
    }
}
