package com.nba.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="classement")
public class Classement {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int idClassement;

    int idJoueur;
    int idEquipe;

    public Classement(){

    }

    public int getIdClassement() {
        return idClassement;
    }
    public void setIdClassement(int idClassement) {
        this.idClassement = idClassement;
    }
    public int getIdJoueur() {
        return idJoueur;
    }
    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }
    public int getIdEquipe() {
        return idEquipe;
    }
    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    
}
