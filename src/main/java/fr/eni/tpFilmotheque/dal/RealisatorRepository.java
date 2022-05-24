package fr.eni.tpFilmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;



public interface RealisatorRepository  extends JpaRepository<Person, Integer>{

}
