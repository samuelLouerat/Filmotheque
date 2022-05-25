package fr.eni.tpFilmotheque.ihm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.tpFilmotheque.bll.GenreServiceImpl;
import fr.eni.tpFilmotheque.bll.ReviewsServiceImpl;
import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.bo.Review;

@Component //Définir le converter en tant que bean Spring
public class StringToReviewConverter implements Converter<String, Review>{ //Implementer Converter

	private ReviewsServiceImpl service;
	
	@Autowired
	public void setMetierService(ReviewsServiceImpl service) {
		this.service = service;
	}
	
	@Override
	public Review convert(String id) {
		Integer theid = Integer.parseInt(id);
		return service.SelectById(theid);

	}

}
