package fr.eni.tpFilmotheque.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;
import fr.eni.tpFilmotheque.dal.RealisatorRepository;
import fr.eni.tpFilmotheque.dal.old.MovieDAO;
import fr.eni.tpFilmotheque.dal.old.RealisatorDAO;

@Service
public class RealisatorServiceImpl implements RealisatorService{

	private RealisatorDAO realisatorDAO;
	private RealisatorRepository repository;
	@Override
	public Person SelectById(int id2) {
		//return realisatorDAO.SelectById(id2);
		return repository.findById(id2).get();
	}

	@Override
	public List<Person> SelectAllRealisator() { 
		return repository.findAll();
	}

	@Override
	public void insert(Person realisator) {

		//realisatorDAO.insert(realisator);
		repository.save(realisator);
		
	}

	public RealisatorServiceImpl
	(
		RealisatorRepository repository
		//RealisatorDAO realisatorDAO
	)  {
			//this.realisatorDAO = realisatorDAO;
			this.repository = repository;
		}

	
	
}
