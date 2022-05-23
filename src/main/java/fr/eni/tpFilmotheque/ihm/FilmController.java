package fr.eni.tpFilmotheque.ihm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


import fr.eni.tpFilmotheque.bll.MovieManager;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Movie;

@Controller
@SessionAttributes("genres")
public class FilmController {
	
	private MovieManager movieManager;

	public FilmController(MovieManager movieManager) {
		this.movieManager = movieManager;
	}
	
	@GetMapping({"/movie/list", ""})
	public String movieCatalog(Model modele) {
		
		Movie movie = new Movie();
		movieManager.insert(movie); 
		
		modele.addAttribute("movies", movieManager.SelectAllMovie());
		
		return "movieList";
	}
	
	@GetMapping("/movie/add")
	public String movieAdd(Model modele) {
		Movie movie = new Movie();
		movie.setId(0);
		movie.setTitle("La 7 eme compagnie");
		
		
//		movie.setSynopsis( "Un film de gendarmes pas très très futés");
//		movie.setReleaseYear(1993);
//		movie.setDuration(180);
//		movie.setImg("/7compagnie.jpg");	

		modele.addAttribute("movie",movie);

		return "movieAdd";
	}
	
	@PostMapping("/movieList")
	public String movieAdd( @ModelAttribute("movie") Movie movie,Model modele
			             ) {
		System.out.println(modele.getAttribute("genreSelect"));
		movieManager.insert(movie); 
		modele.addAttribute("movies", movieManager.SelectAllMovie());

		
		return "movieList";
	}
	
	@GetMapping("/movie/details/{id}")
	public String movieDetails(@PathVariable int id, Model modele) {
		
		modele.addAttribute("movie", movieManager.SelectById(id));
		
		return "movieDetails";
	}
}
