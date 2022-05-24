package fr.eni.tpFilmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import fr.eni.tpFilmotheque.bo.Movie;



public interface MovieRepository  extends JpaRepository<Movie, Integer>{

}
