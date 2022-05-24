package fr.eni.tpFilmotheque.dal.old;

import java.util.List;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;

public interface RealisatorDAO {

	Person SelectById(int id);
	
	List<Person> SelectAllRealisator();
	
	void insert(Person realisator);
}
