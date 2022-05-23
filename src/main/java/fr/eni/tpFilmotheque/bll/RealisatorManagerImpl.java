package fr.eni.tpFilmotheque.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;
import fr.eni.tpFilmotheque.dal.MovieDAO;
import fr.eni.tpFilmotheque.dal.RealisatorDAO;

@Service
public class RealisatorManagerImpl implements RealisatorManager{

	private RealisatorDAO realisatorDAO;
	
	@Override
	public Person SelectById(int id2) {
		return realisatorDAO.SelectById(id2);
	}

	@Override
	public List<Person> SelectAllRealisator() { 
		return realisatorDAO.SelectAllRealisator();
	}

	@Override
	public void insert(Person realisator) {

		realisatorDAO.insert(realisator);
		
	}

	public RealisatorManagerImpl
	(
		RealisatorDAO realisatorDAO
	)  {
			this.realisatorDAO = realisatorDAO;
		}

	
	
}
