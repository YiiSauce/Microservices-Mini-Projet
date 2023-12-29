package com.miniprojet.firstservice.service;

import com.miniprojet.firstservice.entities.Medecin;

import java.util.List;

public interface MedecinService {
    Medecin saveMedecin(Medecin medecin);
    public List<Medecin> getAllMedecins();
    public Medecin getMedecin(Long auteurId);
    public void DeleteMedecin(Long id);
    public  Medecin updateMedecin(Medecin medecin);
}
