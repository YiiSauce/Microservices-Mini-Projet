package com.miniprojet.firstservice;

import com.miniprojet.firstservice.entities.Medecin;
import com.miniprojet.firstservice.entities.Patient;
import com.miniprojet.firstservice.repositories.MedecinRepository;
import com.miniprojet.firstservice.repositories.PatientRepository;
import com.miniprojet.firstservice.service.MedecinService;
import com.miniprojet.firstservice.service.PatientsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@EnableDiscoveryClient
@SpringBootApplication
public class FirstServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(
            PatientRepository patientRepository,
            MedecinRepository medecinRepository,
            MedecinService medecinService,
            PatientsService patientsService
    ) {
        return args -> {
            Stream.of("Mohammed", "najat", "hassan")
                    .forEach(name -> {
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setMalade(false);
                        patient.setDateNaissance(new Date());
                        patientsService.savePatient(patient);

                    });
            Stream.of("Bennani", "Adnani", "Benzabour")
                    .forEach(name -> {
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setSpecalite(Math.random() > 0.5 ? "Cardio" : "Dentiste");
                        medecin.setEmail(name + "@gamil.com");
                        medecinService.saveMedecin(medecin);
                    });
        };
    }
}