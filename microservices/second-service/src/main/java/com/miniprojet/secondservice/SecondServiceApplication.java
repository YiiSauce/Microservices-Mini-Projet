package com.miniprojet.secondservice;

import com.miniprojet.secondservice.client.MedecinRestClient;
import com.miniprojet.secondservice.client.PatientRestClient;
import com.miniprojet.secondservice.entities.Consultation;
import com.miniprojet.secondservice.entities.RendezVous;
import com.miniprojet.secondservice.entities.StatusRDV;
import com.miniprojet.secondservice.model.Medecin;
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
import java.util.stream.Stream;

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
//			RendezvousRepository rendezvousRepository,
//			MedecinRestClient medecinRestClient
////			PatientRestClient patientRestClient
//	) {
//		return args -> {
//			List<Medecin> medecins=medecinRestClient.getMedecins().stream().toList();
//			Long medecinId=1L;
//			Medecin medecin=medecinRestClient.getMedecinById(medecinId);
//
//			for (int i = 0; i <10 ; i++) {
//			RendezVous rendezvous = RendezVous.builder()
//					.date(new Date())
//					.annule(false)
//					.statusRDV(StatusRDV.PENDING)
//					.medecinId(medecins.get(i).getId()).build();
//			RendezVous savedRendezVous = rendezvousService.saveRendezVous(rendezvous);
//
//			Consultation consultation = Consultation.builder()
//					.dateConsultation(new Date())
//					.rapport("Rapport de la consultation")
//					.rendezVous(savedRendezVous).build();
//
//			consultation.setDateConsultation(new Date());
//			consultation.setRendezVous(savedRendezVous);
//			consultationService.saveConsultation(consultation);
//			}
//
//		};
//	}
}