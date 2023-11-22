package com.nba.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "Joueurs")
public class Joueurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idJoueur;
@Column(name = "nomjoueur")
    String nomJoueur;
    @Column(name = "idequipe")
    int idEquipe;

    public Joueurs(){

    }
    public int getIdJoueur() {
        return idJoueur;
    }
    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }
    public String getNomJoueur() {
        return nomJoueur;
    }
    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }
    public int getIdEquipe() {
        return idEquipe;
    }
    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }


}
