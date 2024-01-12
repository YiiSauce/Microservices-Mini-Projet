package com.example.hospital.service;

import com.example.hospital.entities.Patient;
import com.example.hospital.entities.RendezVous;

import java.util.List;

public interface RendezvousService {

    RendezVous saveRendezVous(RendezVous rendezVous);

    List<RendezVous> getAllRendezVous();

    RendezVous getRendezVous(Long rendezvousId);

    void DeleteRendezVous(Long id);

    RendezVous updateRendezVous(RendezVous rendezVous);
}
