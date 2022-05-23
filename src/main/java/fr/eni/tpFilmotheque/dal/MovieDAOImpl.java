package fr.eni.tpFilmotheque.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
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
		
//		Movie movie2=new Movie();
//		movie2.setId(movies.size());
//		movie2.setTitle("La 7 eme compagnie");
//		movie2.setSynopsis( "Un film de gendarmes pas très très futés");
//		movie2.setReleaseYear(1993);
//		movie2.setDuration(180);
//		movie2.setImg("/7compagnie.jpg");	
//		movies.add(movie2);
	}
	
	
	
}
