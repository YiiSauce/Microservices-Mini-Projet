package com.miniprojet.secondservice.repositories;

import com.miniprojet.secondservice.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezvousRepository
        extends JpaRepository<RendezVous,Long> {
}
