package com.miniprojet.firstservice.repositories;


import com.miniprojet.firstservice.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient, Long> {
     Patient findByNom(String nom);
}
