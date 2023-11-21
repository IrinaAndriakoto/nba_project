package main.java.com.nba.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import main.java.com.nba.demo.service.*;
import main.java.com.nba.demo.model.*;;

@RestController
@RequestMapping("/joueurs")
public class Controller {
    private final ServiceJoueurs service;

    public Controller(ServiceJoueurs service) {
        this.service = service;
    }

    @GetMapping("/getJoueurs") // Définissez le chemin de base pour toutes les routes du contrôleur
    public List<Joueurs> getAllJoueurs() {
        return service.getAllJoueurs();
    }

    @GetMapping("/joueurs/{id}")
    public Joueurs getJoueurs(@PathVariable Long id) {
        return service.getJoueursById(id);
    }

    @PostMapping("/addJoueurs")
    public Joueurs createJoueurs(@RequestBody Joueurs jou) {
        return service.createJoueurs(jou);
    }

    // @PutMapping("/{id}")
    // public Joueurs updateJoueurs(@PathVariable Long id, @RequestBody Joueurs updatedJoueurs) {
    //     return service.updateJoueurs(id, updatedJoueurs);
    // }

    @DeleteMapping("/delete/{id}")
    public void deleteJoueurs(@PathVariable Long id) {
        service.deleteJoueurs(id);
    }
}