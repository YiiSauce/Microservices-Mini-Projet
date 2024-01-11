package com.miniprojet.secondservice.services;

import com.miniprojet.secondservice.client.FirstServiceRestClient;
import com.miniprojet.secondservice.entities.Consultation;
import com.miniprojet.secondservice.entities.RendezVous;
import com.miniprojet.secondservice.model.Medecin;
import com.miniprojet.secondservice.model.Patient;
import com.miniprojet.secondservice.repositories.ConsultationRepository;
import com.miniprojet.secondservice.repositories.RendezvousRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class RendezvousServiceImpl  implements RendezvousService{
    @Autowired
    private RendezvousRepository rendezvousRepository;
    @Autowired
    private ConsultationRepository consultationRepository;
    @Autowired
    private FirstServiceRestClient firstServiceRestClient;
    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous){
        Medecin medecin = firstServiceRestClient.getMedecinById(rendezVous.getMedecinId());
        Patient patient = firstServiceRestClient.getPatientById(rendezVous.getPatientId());
        if(medecin!=null && patient!=null){
        rendezVous.setMedecin(medecin);
        rendezVous.setPatient(patient);
        return rendezvousRepository.save(rendezVous);
        }
        return null;
    }
    @Override
    public List<RendezVous> getAllRendezVous(){return rendezvousRepository.findAll();}
    @Override
    public RendezVous getRendezVous(Long rendezvousId) {
        RendezVous rendezVous = rendezvousRepository.findById(rendezvousId).orElse(null);
        Medecin medecin = firstServiceRestClient.getMedecinById(rendezVous.getMedecinId());
        Patient patient = firstServiceRestClient.getPatientById(rendezVous.getPatientId());
        rendezVous.setMedecin(medecin);
        rendezVous.setPatient(patient);
        return rendezVous;
    };
    @Override
    public void deleteRendezVous(Long id){
        RendezVous rendezVous = rendezvousRepository.findById(id).orElse(null);
        if (rendezVous != null) {
            Consultation consultation = rendezVous.getConsultation();
            if (consultation != null) {
                consultationRepository.deleteById(consultation.getId());
            }
            rendezvousRepository.deleteById(id);
        }
    };
    @Override
    public  RendezVous updateRendezVous(RendezVous rendezVous){
        RendezVous rv = getRendezVous(rendezVous.getId());
        rv.setStatusRDV(rendezVous.getStatusRDV());
        rv.setDate(rendezVous.getDate());
        rv.setAnnule(rendezVous.isAnnule());
        rv.setConsultation(rendezVous.getConsultation());
        rv.setPatientId(rendezVous.getPatientId());
        rv.setMedecinId(rendezVous.getMedecinId());
        Medecin medecin = firstServiceRestClient.getMedecinById(rendezVous.getMedecinId());
        Patient patient = firstServiceRestClient.getPatientById(rendezVous.getPatientId());
        rv.setMedecin(medecin);
        rv.setPatient(patient);
        return rendezvousRepository.save(rv);
    };
}
