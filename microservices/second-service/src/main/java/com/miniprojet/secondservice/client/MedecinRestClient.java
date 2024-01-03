//package com.miniprojet.secondservice.client;
//
//import com.miniprojet.secondservice.model.Medecin;
//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//@FeignClient(name = "FIRST-SERVICE")
//public interface MedecinRestClient {
//    @GetMapping("/medecins/{id}")
//    public Medecin getMedecinById(@PathVariable Long id);
//    @GetMapping("/medecins")
//    public List<Medecin> getMedecins();
//
//    default Medecin getDefaultCustomer(Long id,Exception exception){
//        Medecin medecin=new Medecin();
//        medecin.setId(id);
//        medecin.setNom("not available");
//        medecin.setEmail("not available");
//        medecin.setSpecalite("not available");
//        return medecin;
//    }
//}
