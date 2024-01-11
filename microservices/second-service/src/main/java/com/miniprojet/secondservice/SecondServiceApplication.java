package com.miniprojet.secondservice;

import com.miniprojet.secondservice.client.FirstServiceRestClient;
import com.miniprojet.secondservice.entities.Consultation;
import com.miniprojet.secondservice.entities.RendezVous;
import com.miniprojet.secondservice.entities.StatusRDV;
import com.miniprojet.secondservice.model.Medecin;
import com.miniprojet.secondservice.model.Patient;
import com.miniprojet.secondservice.repositories.RendezvousRepository;
import com.miniprojet.secondservice.services.ConsultationService;
import com.miniprojet.secondservice.services.RendezvousService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class SecondServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecondServiceApplication.class, args);
	}

//	@Bean
//	CommandLineRunner start(
//			RendezvousService rendezvousService,
//			ConsultationService consultationService,
//			FirstServiceRestClient firstServiceRestClient
//	) {
//		return args -> {
//			List<Medecin> medecins=firstServiceRestClient.getMedecins().stream().toList();
//			List<Patient> patients=firstServiceRestClient.getPatients().stream().toList();
//
//			for (int i = 0; i <5 ; i++) {
//			RendezVous rendezvous = RendezVous.builder()
//					.date(new Date())
//					.annule(Math.random() > 0.5 ? false:true)
//					.statusRDV(StatusRDV.PENDING)
//					.patientId(patients.get(i).getId())
//					.medecinId(medecins.get(i).getId()).build();
//			RendezVous savedRendezVous = rendezvousService.saveRendezVous(rendezvous);
//			Consultation consultation = Consultation.builder()
//					.dateConsultation(new Date())
//					.rapport("Rapport de la consultation")
//					.rendezVous(savedRendezVous).build();
//			consultation.setDateConsultation(new Date());
//			consultation.setRendezVous(savedRendezVous);
//			consultationService.saveConsultation(consultation);
//			}
//		};
//	}
}