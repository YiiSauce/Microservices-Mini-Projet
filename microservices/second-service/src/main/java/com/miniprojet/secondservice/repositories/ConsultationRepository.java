package com.miniprojet.secondservice.repositories;

import com.miniprojet.secondservice.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
