package com.miniprojet.firstservice.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Builder
@Data @NoArgsConstructor @AllArgsConstructor
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    private String specalite;
}
