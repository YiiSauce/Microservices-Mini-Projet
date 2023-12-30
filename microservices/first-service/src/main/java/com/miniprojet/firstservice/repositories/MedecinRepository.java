package com.miniprojet.firstservice.repositories;

import com.miniprojet.firstservice.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedecinRepository extends JpaRepository<Medecin, Long> {
     Medecin findByNom(String nom);
}
