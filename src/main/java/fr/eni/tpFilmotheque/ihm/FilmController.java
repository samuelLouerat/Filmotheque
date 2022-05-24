package fr.eni.tpFilmotheque.ihm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


import fr.eni.tpFilmotheque.bll.MovieService;
import fr.eni.tpFilmotheque.bll.RealisatorService;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Movie;

@Controller
@SessionAttributes("genres")
public class FilmController {
	
	private RealisatorService realisatorManager;
	private MovieService movieManager;
	public FilmController(RealisatorService manager, MovieService movieMgr) {
		this.realisatorManager = manager;
		this.movieManager = movieMgr;
	}
	
	@GetMapping({"/movie/list", ""})
	public String movieCatalog(Model modele) {
		
		//Movie movie = new Movie();
		//movieManager.insert(movie); 
		
		modele.addAttribute("movies", movieManager.SelectAllMovie());
		
		return "movieList";
	}
	
	@GetMapping("/movie/add")
	public String movieAdd(Model modele) {
		Movie movie = new Movie();
//		movie.setId(0);
//		movie.setTitle("");
		modele.addAttribute("actors", realisatorManager.SelectAllRealisator());
		modele.addAttribute("movie",movie);

		return "movieAdd";
	}
	
	@PostMapping("/movie/add")
	public String movieAdd( @Valid @ModelAttribute("movie") Movie movie, BindingResult reultTest,Model modele
			             ) {
		if (reultTest.hasErrors()) {
			return "movieAdd" ;
		}
		
		//System.out.println(modele.getAttribute("genreSelect"));
		movieManager.insert(movie); 
		modele.addAttribute("movies", movieManager.SelectAllMovie());

		
		return "movieList";
	}
	
	@GetMapping("/movie/details/{id}")
	public String movieDetails(@PathVariable Integer id, Model modele) {
		
		modele.addAttribute("movie", movieManager.SelectById(id));
		
		return "movieDetails";
	}
}
