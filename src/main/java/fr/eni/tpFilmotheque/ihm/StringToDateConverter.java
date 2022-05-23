package fr.eni.tpFilmotheque.ihm;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tpFilmotheque.bll.GenreServiceImpl;
import fr.eni.tpFilmotheque.bll.RealisatorManagerImpl;
import fr.eni.tpFilmotheque.bo.Genre;

@Component //Définir le converter en tant que bean Spring
public class StringToDateConverter implements Converter<String, LocalDate>{ //Implementer Converter

	private RealisatorManagerImpl service;
	
	@Autowired
	public void setMetierService(RealisatorManagerImpl service) {
		this.service = service;
	}
	
	@Override
	public LocalDate convert(String dateDeNaissance) {
		LocalDate dateDeNaiss = LocalDate.parse(dateDeNaissance);
		return dateDeNaiss;
	}

}
