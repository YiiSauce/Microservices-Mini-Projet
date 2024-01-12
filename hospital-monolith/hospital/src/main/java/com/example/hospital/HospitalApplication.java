package com.example.hospital;

import com.example.hospital.entities.*;
import com.example.hospital.repositories.MedecinRepository;
import com.example.hospital.repositories.PatientRepository;
import com.example.hospital.repositories.RendezvousRepository;
import com.example.hospital.service.MedecinService;
import com.example.hospital.service.PatientsService;
import com.example.hospital.service.RendezvousService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;


@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
//    @Bean
//   CommandLineRunner start(
//                          PatientRepository patientRepository,
//                           MedecinRepository medecinRepository,
//                           MedecinService medecinService,
//                           PatientsService patientsService,
//                          RendezvousService rendezvousService,
//                          RendezvousRepository rendezvousRepository
//                           ){
//        return args -> {
//            Stream.of("Mohammed", "najat", "hassan")
//                    .forEach(name->{
//                        Patient patient = new Patient();
//                        patient.setNom(name);
//                        patient.setMalade(false);
//                        patient.setDateNaissance(new Date());
//                        patientsService.savePatient(patient);
//
//                    });
//            Stream.of("Bennani", "Adnani", "Benzabour")
//                    .forEach(name->{
//                        Medecin medecin = new Medecin();
//                        medecin.setNom(name);
//                        medecin.setSpecalite(Math.random()>0.5?"Cardio":"Dentiste");
//                        medecin.setEmail(name+"@gamil.com");
//                        medecinService.saveMedecin(medecin);
//
//
//                    });
//            Patient patient=  patientRepository.findByNom("Mohammed");
//            Medecin medecin= medecinRepository.findByNom("Adnani");
//            RendezVous rendezvous= new RendezVous();
//            rendezvous.setDate(new Date());
//            rendezvous.setStatusRDV(StatusRDV.PENDING);
//            rendezvous.setPatient(patient);
//            rendezvous.setMedecin(medecin);
//            rendezvousService.saveRendezVous(rendezvous);
//
//            RendezVous rendezvous1= rendezvousRepository.findById(1L).orElse(null);
//            Consultation consultation= new Consultation();
//            consultation.setDateConsultation(rendezvous1.getDate());
//            consultation.setRendezVous(rendezvous1);
//            consultation.setRapport("Rapport de la consultation");
//            hospitalService.saveConsultation(consultation);
//        };
   }

