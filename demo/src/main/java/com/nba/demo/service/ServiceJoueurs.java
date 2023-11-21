package main.java.com.nba.demo.service;

import main.java.com.nba.demo.repository.Repository;
import main.java.com.nba.demo.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceJoueurs {
    private final Repository rep;

    @Autowired
    public ServiceJoueurs(Repository rep) {
        this.rep = rep;
    }

    //Joueurs
    public List<Joueurs> getAllJoueurs() {
        return rep.findAll();
    }
    public Joueurs getJoueursById(Long id){
        return rep.findById(id).orElse(null);
    }

    public Joueurs createJoueurs(Joueurs j){
        return rep.save(j);
    }
    // public updateJoueurs
    public void deleteJoueurs(Long id){
        rep.deleteById(id);
    }


   
}

