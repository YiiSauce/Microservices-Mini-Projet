package com.miniprojet.secondservice.model;

import lombok.Data;

@Data
public class Medecin {
    private Long id;
    private String nom;
    private String email;
    private String specalite;
}
