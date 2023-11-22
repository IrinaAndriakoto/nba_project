package com.nba.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.nba.demo.service.*;
import com.nba.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController()
@RequestMapping("/joueurs")
public class Controller {
    @Autowired
    ServiceJoueurs service;


    @GetMapping// Définissez le chemin de base pour toutes les routes du contrôleur
    public List<Joueurs> getAllJoueurs() {
        return service.getAllJoueurs();
    }

    @GetMapping("/{id}")
    public Joueurs getJoueurs(@PathVariable Long id) {
        return service.getJoueursById(id);
    }

    @PostMapping("/add")
    public Joueurs createJoueurs(@RequestBody Joueurs jou) {
        return service.createJoueurs(jou);
    }

    // @PutMapping("/{id}")
    // public Joueurs updateJoueurs(@PathVariable Long id, @RequestBody Joueurs updatedJoueurs) {
    //     return service.updateJoueurs(id, updatedJoueurs);
    // }

    @DeleteMapping("/{id}")
    public void deleteJoueurs(@PathVariable Long id) {
        service.deleteJoueurs(id);
    }
}