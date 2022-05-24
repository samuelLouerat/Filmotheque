package fr.eni.tpFilmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tpFilmotheque.bll.GenreServiceImpl;
import fr.eni.tpFilmotheque.bll.RealisatorServiceImpl;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Person;

@Component //Définir le converter en tant que bean Spring
public class StringToActorConverter implements Converter<String, Person>{ //Implementer Converter

	private RealisatorServiceImpl service;
	
	@Autowired
	public void setMetierService(RealisatorServiceImpl service) {
		this.service = service;
	}
	
	@Override
	public Person convert(String id) {
		Integer theid = Integer.parseInt(id);
		return service.SelectById(theid);

	}

}
