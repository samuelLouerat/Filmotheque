package fr.eni.tpFilmotheque.bll;

import java.util.List;

import fr.eni.tpFilmotheque.bo.Person;

public interface RealisatorManager {

	Person SelectById(int id);
	
	List<Person> SelectAllRealisator();
	
	void insert(Person realisateur);
}
