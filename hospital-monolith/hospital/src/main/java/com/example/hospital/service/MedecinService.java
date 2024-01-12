package com.example.hospital.service;

import com.example.hospital.entities.Medecin;
import com.example.hospital.entities.Patient;

import java.util.List;

public interface MedecinService {
    Medecin saveMedecin(Medecin medecin);
    public List<Medecin> getAllMedecins();
    public Medecin getMedecin(Long auteurId);
    public void DeleteMedecin(Long id);
    public  Medecin updateMedecin(Medecin medecin);
}
