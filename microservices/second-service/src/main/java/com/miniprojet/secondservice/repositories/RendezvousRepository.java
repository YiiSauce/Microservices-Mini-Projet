package com.miniprojet.secondservice.repositories;

import com.miniprojet.secondservice.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RendezvousRepository extends JpaRepository<RendezVous,Long> {
}
