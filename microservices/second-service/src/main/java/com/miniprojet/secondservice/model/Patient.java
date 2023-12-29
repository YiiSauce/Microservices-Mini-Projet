package com.miniprojet.secondservice.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
@Data
public class Patient {
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
}
