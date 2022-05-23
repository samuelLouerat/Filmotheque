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


import fr.eni.tpFilmotheque.bll.MovieManager;
import fr.eni.tpFilmotheque.bll.RealisatorManagerImpl;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;

@Controller
@SessionAttributes("genres")
public class RealisateurController {
	
	private RealisatorManagerImpl realisatorManager;

	public RealisateurController(RealisatorManagerImpl realisatorManager) {
		this.realisatorManager = realisatorManager;
	}
	
	@GetMapping({"/realisator/list"})
	public String realisatorCatalog(Model modele) {
		
		Person realisator = new Person();
		realisatorManager.insert(realisator); 
		
		modele.addAttribute("reaslisators", realisatorManager.SelectAllRealisator());
		
		return "movieList";
	}
	
	@GetMapping("/realisator/add")
	public String realisatorAdd(Model modele) {
		Person realisator = new Person();

		modele.addAttribute("realisator",realisator);

		return "realisatorAdd";
	}
	
	@PostMapping("/realisator/add")
	public String movieAdd( @Valid @ModelAttribute("realisator") Person realisator, BindingResult reultTest,Model modele
			             ) {
		if (reultTest.hasErrors()) {
			return "realisatorAdd" ;
		}

		realisatorManager.insert(realisator); 
		modele.addAttribute("realisators", realisatorManager.SelectAllRealisator());

		
		return "realisatorList";
	}
	
	@GetMapping("/realisator/details/{id}")
	public String movieDetails(@PathVariable int id, Model modele) {
		
		modele.addAttribute("realisator", realisatorManager.SelectById(id));
		
		return "realisatorDetail";
	}
}
