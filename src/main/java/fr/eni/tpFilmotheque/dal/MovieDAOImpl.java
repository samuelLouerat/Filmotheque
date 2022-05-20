package fr.eni.tpFilmotheque.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.eni.tpFilmotheque.bo.Movie;

@Repository
public class MovieDAOImpl implements MovieDAO{

	private List<Movie> movies = new ArrayList<Movie>();
	
	@Override
	public Movie SelectById(int id) {
		return movies.get(id);
	}

	@Override
	public List<Movie> SelectAllMovie() {
		return movies;
	}

	@Override
	public void insert(Movie movie) {
		movie.setId(movies.size());
		movies.add(movie);
	}
	
	
	
}
