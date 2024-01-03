package com.miniprojet.secondservice.services;

import com.miniprojet.secondservice.entities.RendezVous;

import java.util.List;

public interface RendezvousService {

    RendezVous saveRendezVous(RendezVous rendezVous);

    List<RendezVous> getAllRendezVous();

    RendezVous getRendezVous(Long rendezvousId);

    void deleteRendezVous(Long id);

    RendezVous updateRendezVous(RendezVous rendezVous);
}
