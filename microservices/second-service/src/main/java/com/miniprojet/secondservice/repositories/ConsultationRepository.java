package com.miniprojet.secondservice.repositories;

import com.miniprojet.secondservice.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository
        extends JpaRepository<Consultation, Long> {
}
