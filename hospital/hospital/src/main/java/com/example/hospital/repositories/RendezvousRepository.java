package com.example.hospital.repositories;

import com.example.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezvousRepository
        extends JpaRepository<RendezVous,Long> {
}
