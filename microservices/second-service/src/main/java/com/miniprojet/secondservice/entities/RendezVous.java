package com.miniprojet.secondservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.miniprojet.secondservice.model.Medecin;
import com.miniprojet.secondservice.model.Patient;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Builder
@Data @AllArgsConstructor @NoArgsConstructor
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private boolean annule;
    @Enumerated(EnumType.STRING)
    private StatusRDV statusRDV;
    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;

    private Long medecinId;
    @Transient
    private Medecin medecin;

    private Long patientId;
    @Transient
    private Patient patient;
}
