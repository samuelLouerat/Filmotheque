package fr.eni.tpFilmotheque.dal;

import java.util.List;

import fr.eni.tpFilmotheque.bo.Movie;

public interface MovieDAO {

	Movie SelectById(int id);
	
	List<Movie> SelectAllMovie();
	
	void insert(Movie movie);
}
