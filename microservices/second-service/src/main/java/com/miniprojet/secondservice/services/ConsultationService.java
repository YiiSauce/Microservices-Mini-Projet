package com.miniprojet.secondservice.services;

import com.miniprojet.secondservice.entities.Consultation;
import java.util.List;

public interface ConsultationService {
    Consultation saveConsultation(Consultation consultation);
    public List<Consultation> getAllConsultations();
    public Consultation getConsultation(Long consultationId);
    public void DeleteConsultation(Long id);
    public  Consultation updateConsultation(Consultation consultation);
}
