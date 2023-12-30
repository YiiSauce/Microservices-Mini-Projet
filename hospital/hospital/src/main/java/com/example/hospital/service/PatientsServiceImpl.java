package com.example.hospital.service;

import com.example.hospital.entities.Patient;
import com.example.hospital.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PatientsServiceImpl  implements  PatientsService{
    private PatientRepository patientRepository;
    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);

    }
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    };
    public Patient getPatient(Long auteurId) {
        return patientRepository.findById(auteurId).orElse(null);
    };
    public void DeletePatient(Long id){
        patientRepository.deleteById(id);
    };
    public  Patient updatePatient(Patient patient){
        return patientRepository.save(patient);
    };
}
