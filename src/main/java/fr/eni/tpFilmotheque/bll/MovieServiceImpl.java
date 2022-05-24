package fr.eni.tpFilmotheque.bll;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.dal.MovieRepository;
import fr.eni.tpFilmotheque.dal.old.MovieDAO;

@Service
public class MovieServiceImpl implements MovieService {

	private MovieRepository repository;
	
	


	public MovieServiceImpl(MovieRepository repository) {
		super();
		this.repository = repository;
	}


	public Movie SelectById(Integer id2) {
		return repository.findById(id2).get();
	}


	public List<Movie> SelectAllMovie() { 
		return (List<Movie>) repository.findAll();
	}

	public void insert(Movie movie) {

		System.out.println(movie.toString());
		repository.save(movie);
		//movieDAO.insert(movie);
		
	}



//	public MovieManagerImpl
//	(
//		MovieDAO movieDAO
//	)  {
//			this.repository = movieDAO;
//		}




	
	
}
