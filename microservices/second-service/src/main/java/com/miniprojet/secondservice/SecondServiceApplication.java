package com.miniprojet.secondservice;

import com.miniprojet.secondservice.entities.Consultation;
import com.miniprojet.secondservice.entities.RendezVous;
import com.miniprojet.secondservice.entities.StatusRDV;
import com.miniprojet.secondservice.repositories.RendezvousRepository;
import com.miniprojet.secondservice.services.ConsultationService;
import com.miniprojet.secondservice.services.RendezvousService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class SecondServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(
			RendezvousService rendezvousService,
			ConsultationService consultationService,
			RendezvousRepository rendezvousRepository
	) {
		return args -> {
			RendezVous rendezvous = new RendezVous();
			rendezvous.setDate(new Date());
			rendezvous.setStatusRDV(StatusRDV.PENDING);
			rendezvousService.saveRendezVous(rendezvous);

			RendezVous rendezvous1 = rendezvousRepository.findById(1L).orElse(null);
			Consultation consultation = new Consultation();
			consultation.setDateConsultation(rendezvous1.getDate());
			consultation.setRendezVous(rendezvous1);
			consultation.setRapport("Rapport de la consultation");
			consultationService.saveConsultation(consultation);
		};
	}
}