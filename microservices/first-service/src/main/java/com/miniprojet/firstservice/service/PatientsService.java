package com.miniprojet.firstservice.service;


import com.miniprojet.firstservice.entities.Patient;

import java.util.List;

public interface PatientsService {
    Patient savePatient(Patient patient);
    public List<Patient> getAllPatients();
    public Patient getPatient(Long auteurId);
    public void DeletePatient(Long id);
    public  Patient updatePatient(Patient patient);

}
