package com.miniprojet.firstservice.service;

import com.miniprojet.firstservice.entities.Medecin;
import com.miniprojet.firstservice.repositories.MedecinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MedecinServiceImpl implements MedecinService {
    private MedecinRepository medecinRepository;
    public Medecin saveMedecin(Medecin medecin){
        return medecinRepository.save(medecin);

    }
    public List<Medecin> getAllMedecins(){
        return medecinRepository.findAll();
    };
    public Medecin getMedecin(Long medecinId) {
        return medecinRepository.findById(medecinId).orElse(null);
    };
    public void DeleteMedecin(Long id){
        medecinRepository.deleteById(id);
    };
    public  Medecin updateMedecin(Medecin medecin){
        return medecinRepository.save(medecin);
    };
}
