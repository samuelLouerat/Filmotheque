package fr.eni.tpFilmotheque.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import fr.eni.tpFilmotheque.bll.GenreServiceImpl;
import fr.eni.tpFilmotheque.bo.Genre;

@Configuration
public class WebConfig {

	@Bean
	@ApplicationScope
	public List<Genre> genres(GenreServiceImpl service){
		return service.getListeGenres();
	}

}