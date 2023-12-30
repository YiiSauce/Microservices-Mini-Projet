package com.example.hospital.service;

import com.example.hospital.entities.RendezVous;
import com.example.hospital.repositories.RendezvousRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public  class RendezvousServiceImpl  implements RendezvousService{
    private RendezvousRepository rendezvousRepository;
    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous){
        return rendezvousRepository.save(rendezVous);

    }
    @Override
    public List<RendezVous> getAllRendezVous(){
        return rendezvousRepository.findAll();
    };
    @Override
    public RendezVous getRendezVous(Long rendezvousId) {
        return rendezvousRepository.findById(rendezvousId).orElse(null);
    };
    @Override
    public void DeleteRendezVous(Long id){
        rendezvousRepository.deleteById(id);
    };
    @Override
    public  RendezVous updateRendezVous(RendezVous rendezVous){
        return rendezvousRepository.save(rendezVous);
    };
}
