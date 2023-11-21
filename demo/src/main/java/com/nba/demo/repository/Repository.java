package main.java.com.nba.demo.repository;
import main.java.com.nba.demo.model.*;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Joueurs, Long> {

}