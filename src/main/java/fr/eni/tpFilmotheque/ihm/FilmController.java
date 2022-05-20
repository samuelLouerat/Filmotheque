package fr.eni.tpFilmotheque.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.tpFilmotheque.bll.MovieManager;
import fr.eni.tpFilmotheque.bo.Movie;

@Controller

public class FilmController {
	
	private MovieManager movieManager;

	public FilmController(MovieManager movieManager) {
		this.movieManager = movieManager;
	}
	
	@GetMapping({"/movie/list", ""})
	public String movieCatalog(Model modele) {
		
		Movie movie = new Movie("Jurassik Park", 180, "Un film sur des dinosaures dans un parc de Spielberg", 1993);
		movieManager.insert(movie); 
		
		modele.addAttribute("movies", movieManager.SelectAllMovie());
		
		return "movieList";
	}
	
//	@GetMapping("/movie/details")
//	public String movieDetails(@RequestParam String id, Model modele) {
//		
//		modele.addAttribute("movie", movieManager.SelectById(Integer.parseInt(id)));
//		
//		return "movieDetails";
//	}
	
	@GetMapping("/movie/details/{id}")
	public String movieDetails(@PathVariable int id, Model modele) {
		
		modele.addAttribute("movie", movieManager.SelectById(id));
		
		return "movieDetails";
	}
}
