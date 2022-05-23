package fr.eni.tpFilmotheque.bll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.tpFilmotheque.bo.Genre;
@Service
public class GenreServiceImpl {

	
	private List<Genre> listeGenres;
	private Map<Integer, Genre> mapGenres;
	
	public GenreServiceImpl() {
		listeGenres = new ArrayList<>();
		listeGenres.add( new Genre(1, "comique"));
		listeGenres.add( new Genre(2, "fiction"));
		listeGenres.add(new Genre(3, "drame"));
		
		mapGenres = new HashMap<Integer, Genre>();
		listeGenres.forEach(m -> mapGenres.put(m.getId(), m));
		
	}
	
	public List<Genre> getListeGenres(){
		return listeGenres;		
	}
	public Map<Integer, Genre> getMapGenres(){
		return mapGenres;
	}
	
	
	
	
}
