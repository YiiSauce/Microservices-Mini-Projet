package com.miniprojet.secondservice.web;

import com.miniprojet.secondservice.entities.RendezVous;
import com.miniprojet.secondservice.services.RendezvousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RendezvousController {
    @Autowired
    private RendezvousService rendezvousService;

    @GetMapping(path = "rendezVous")
    public List<RendezVous> getRendezVous(){
        return rendezvousService.getAllRendezVous() ;
    }

    @GetMapping("rendezVous/{rendezVousId}")
    public  RendezVous getRendezvousById(@PathVariable Long rendezVousId){
        return rendezvousService.getRendezVous(rendezVousId);
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
