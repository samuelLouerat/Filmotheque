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
import fr.eni.tpFilmotheque.bll.RealisatorServiceImpl;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;

@Controller

public class ActeurController {
	
	private RealisatorServiceImpl actorManager;

	public ActeurController(RealisatorServiceImpl actorManager) {
		this.actorManager = actorManager;
	}
	
	@GetMapping({"/actor/list"})
	public String actorCatalog(Model modele) {
		
		Person actor = new Person();
		actorManager.insert(actor); 
		
		modele.addAttribute("actors", actorManager.SelectAllRealisator());
		
		return "actorList";
	}
	
	@GetMapping("/actor/add")
	public String actorAdd(Model modele) {
		Person actor = new Person();

		modele.addAttribute("actor",actor);

		return "actorAdd";
	}
	
	@PostMapping("/actor/add")
	public String actorAdd( @Valid @ModelAttribute("actor") Person actor, BindingResult reultTest,Model modele
			             ) {
		if (reultTest.hasErrors()) {
			return "actorAdd" ;
		}

		actorManager.insert(actor); 
		modele.addAttribute("actors", actorManager.SelectAllRealisator());

		
		return "actorList";
	}
	
	@GetMapping("/actor/details/{id}")
	public String actorDetails(@PathVariable int id, Model modele) {
		
		modele.addAttribute("actor", actorManager.SelectById(id));
		
		return "actorDetail";
	}
}
