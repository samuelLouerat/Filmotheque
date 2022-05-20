package fr.eni.tpFilmotheque.bll;

import java.util.List;

import fr.eni.tpFilmotheque.bo.Movie;

public interface MovieManager {

	Movie SelectById(int id);
	
	List<Movie> SelectAllMovie();
	
	void insert(Movie movie);
}
