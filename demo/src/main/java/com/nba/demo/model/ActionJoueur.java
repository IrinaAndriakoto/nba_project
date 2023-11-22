package com.nba.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ActionJoueur")
public class ActionJoueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idActionJoueur;

    int idJoueur;
    int idMatch;
    int idAction;

    public int getIdActionJoueur() {
        return idAction;
    }
    public void setIdActionJoueur(int idAction) {
        this.idAction = idAction;
    }
    public int getIdJoueur() {
        return idJoueur;
    }
    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }
    public int getIdMatch() {
        return idMatch;
    }
    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }
    public int getIdAction() {
        return idAction;
    }
    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }
}
