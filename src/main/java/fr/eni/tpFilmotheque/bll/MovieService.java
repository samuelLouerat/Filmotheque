package fr.eni.tpFilmotheque.bll;

import java.util.List;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.dal.MovieRepository;

public interface MovieService {

	Movie SelectById(Integer id);
	
	List<Movie> SelectAllMovie();
	
	//void insert(Movie movie);

	void insert(Movie movie);
}
