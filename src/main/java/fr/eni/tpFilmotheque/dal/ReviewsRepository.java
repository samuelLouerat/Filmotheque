package fr.eni.tpFilmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;
import fr.eni.tpFilmotheque.bo.Review;



public interface ReviewsRepository  extends JpaRepository<Review, Integer>{

}
