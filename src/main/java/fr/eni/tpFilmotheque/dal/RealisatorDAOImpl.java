package fr.eni.tpFilmotheque.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;

@Repository
public class RealisatorDAOImpl implements RealisatorDAO{

	private List<Person> realisators = new ArrayList<Person>();
	
	@Override
	public Person SelectById(int id) {
		return realisators.get(id);
	}

	@Override
	public List<Person> SelectAllRealisator() {
		return realisators;
	}

	@Override
	public void insert(Person realisator) {
		realisator.setId(realisators.size());

		realisators.add(realisator);
		
	}
	
	
	
}
