package fr.eni.tpFilmotheque.bll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.tpFilmotheque.bo.Genre;
import fr.eni.tpFilmotheque.dal.GenreRepository;

@Service
public class GenreServiceImpl {

	private GenreRepository genreRepository;
	private Map<Integer, Genre> mapGenres;
	
	public GenreServiceImpl(GenreRepository repository) {
		this.genreRepository=repository;
	}
	
	public Genre SelectById(Integer id2) {
		return genreRepository.getById(id2);
	}

	
	public List<Genre> getListeGenres(){
		return genreRepository.findAll();	
	}
	
}
