package com.miniprojet.firstservice.repositories;

import com.miniprojet.firstservice.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
     Medecin findByNom(String nom);
}
