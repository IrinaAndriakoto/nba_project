package main.java.com.nba.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Match")
public class Match {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMatch;

    int idEquipe1;
    int idEquipe2;

    public Match(){
        
    }

    public int getIdMatch() {
        return idMatch;
    }
    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }
    public int getIdEquipe1() {
        return idEquipe1;
    }
    public void setIdEquipe1(int idEquipe1) {
        this.idEquipe1 = idEquipe1;
    }
    public int getIdEquipe2() {
        return idEquipe2;
    }
    public void setIdEquipe2(int idEquipe2) {
        this.idEquipe2 = idEquipe2;
    }
}
