package fr.eni.tpFilmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tpFilmotheque.bll.GenreServiceImpl;
import fr.eni.tpFilmotheque.bo.Genre;

@Component //Définir le converter en tant que bean Spring
public class StringToGenreConverter implements Converter<String, Genre>{ //Implementer Converter

	private GenreServiceImpl service;
	
	@Autowired
	public void setMetierService(GenreServiceImpl service) {
		this.service = service;
	}
	
	@Override
	public Genre convert(String id) {
		Integer theid = Integer.parseInt(id);
		return service.SelectById(theid);

	}

}
