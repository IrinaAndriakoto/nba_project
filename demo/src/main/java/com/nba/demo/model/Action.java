package main.java.com.nba.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Action")
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAction;

    String action;

    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
