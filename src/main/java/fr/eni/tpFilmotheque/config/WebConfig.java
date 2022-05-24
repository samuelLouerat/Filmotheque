package fr.eni.tpFilmotheque.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.tpFilmotheque.bll.GenreServiceImpl;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;
import fr.eni.tpFilmotheque.dal.MovieRepository;

@Configuration
public class WebConfig {

	@Bean
	@ApplicationScope
	public List<Genre> genres(GenreServiceImpl service) {
		return service.getListeGenres();
	}
//	@Bean
//	public CommandLineRunner demo(MovieRepository repository)
//
//	{
//				return(args) -> {
//					// ajouter des personnes
//					Movie titanic = new Movie("oulala c'est top","titanic");
//					Movie inception = new Movie("c'est bien aussi","Inception");
//					Movie ensFete = new Movie("c'est drole","Le sens de la fete");
//					
//					Person dicaprio = new Person("dicaprio","leonardo");
//					Person dujardin = new Person("dujardin","jean");
//					Person dupontel = new Person("dupontel","albert");
//					
//					titanic.setActor(dicaprio);
//					titanic.setActor(dupontel);
//					inception.setActor(dicaprio);
//					ensFete.setActor(dupontel);
//					repository.save(titanic);
//					repository.save(inception);
//					repository.save(ensFete);
//					repository.findAll().forEach(pers->System.out.println(pers));};}
//				
	}
