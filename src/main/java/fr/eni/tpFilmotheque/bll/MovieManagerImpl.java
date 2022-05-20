package fr.eni.tpFilmotheque.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.dal.MovieDAO;

@Service
public class MovieManagerImpl implements MovieManager{

	private MovieDAO movieDAO;
	
	@Override
	public Movie SelectById(int id) {
		return movieDAO.SelectById(id);
	}

	@Override
	public List<Movie> SelectAllMovie() { 
		return movieDAO.SelectAllMovie();
	}

	@Override
	public void insert(Movie movie) {

		movieDAO.insert(movie);
		
	}

	public MovieManagerImpl
	(
		MovieDAO movieDAO
	)  {
			this.movieDAO = movieDAO;
		}

	
	
}
