package com.example.hospital.service;

import com.example.hospital.entities.Consultation;
import com.example.hospital.repositories.ConsultationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ConsultationServiceImpl implements  ConsultationService{
    private ConsultationRepository consultationRepository;
    public Consultation saveConsultation(Consultation consultation){
        return consultationRepository.save(consultation);
    };
    public List<Consultation> getAllConsultations(){
        return consultationRepository.findAll();
    };
    public Consultation getConsultation(Long consultationId){
        return  consultationRepository.findById(consultationId).orElse(null);
    };
    public void DeleteConsultation(Long id){
        consultationRepository.deleteById(id);
    };
    public  Consultation updateConsultation(Consultation consultation){
        return consultationRepository.save(consultation);
    };
}
