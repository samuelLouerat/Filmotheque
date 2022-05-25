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
import fr.eni.tpFilmotheque.bll.MovieServiceImpl;
import fr.eni.tpFilmotheque.bll.RealisatorServiceImpl;
import fr.eni.tpFilmotheque.bll.ReviewsServiceImpl;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;
import fr.eni.tpFilmotheque.bo.Review;

@Controller
@SessionAttributes("genres")
public class ReviewsController {
	
	private ReviewsServiceImpl reviewsManager;
	private MovieServiceImpl movieManager;
	
	public ReviewsController(ReviewsServiceImpl reviewManager, MovieServiceImpl movieManager) {
		this.reviewsManager = reviewManager;
		this.movieManager=movieManager;
	}
	
	@GetMapping({"/reviews/list"})
	public String reviewsCatalog(Model modele) {
		
		Review review = new Review();
		reviewsManager.insert(review); 
		modele.addAttribute("reviews", reviewsManager.SelectAllReviews());
		
		return "reviewList";
	}
	
	@GetMapping("/review/add")
	public String reviewrAdd(@RequestParam String movieId,Model modele) {
		Review review = new Review();
		modele.addAttribute("review",review);
		modele.addAttribute("movieId",movieId);

		return "reviewAdd";
	}
	
	@PostMapping("/review/add")
	public String reviewAdd( @Valid @ModelAttribute("review") Review review, @RequestParam("movieId")String movieId, BindingResult reultTest,Model modele
			             ) {
//		if (reultTest.hasErrors()) {
//			return "reviewAdd" ;
//		}

		reviewsManager.insert(review); 
		//recuperer film par l'id
		Integer theid = Integer.parseInt(movieId);
		Movie movie=movieManager.SelectById(theid);
		//ajouter l'avis
		movie.getReviews().add(review);
		//update film
		movieManager.insert(movie);
		//modele.addAttribute("reviews", reviewsManager.SelectAllReviews());
		modele.addAttribute("movie",movie);
		return "movieDetails";
	}
	
	@GetMapping("/reviews/details/{id}")
	public String reviewsDetails(@PathVariable int id, Model modele) {
		
		modele.addAttribute("review", reviewsManager.SelectById(id));
		
		return "reviewDetail";
	}
}
