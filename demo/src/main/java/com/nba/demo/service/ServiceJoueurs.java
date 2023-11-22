package com.nba.demo.service;

import com.nba.demo.repository.Repository;
import com.nba.demo.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceJoueurs {
    @Autowired
    Repository rep;


    //Joueurs
    public List<Joueurs> getAllJoueurs() {
        List<Joueurs> j;
        j = rep.findAll();
        return j;
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

