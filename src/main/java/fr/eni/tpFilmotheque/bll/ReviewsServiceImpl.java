package fr.eni.tpFilmotheque.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tpFilmotheque.bo.Movie;
import fr.eni.tpFilmotheque.bo.Person;
import fr.eni.tpFilmotheque.bo.Review;
import fr.eni.tpFilmotheque.dal.RealisatorRepository;
import fr.eni.tpFilmotheque.dal.ReviewsRepository;
import fr.eni.tpFilmotheque.dal.old.MovieDAO;
import fr.eni.tpFilmotheque.dal.old.RealisatorDAO;

@Service
public class ReviewsServiceImpl implements ReviewService{

	private ReviewsRepository repository;
	
	public ReviewsServiceImpl
	(
		ReviewsRepository repository
	)  {
			this.repository = repository;
		}
	
	@Override
	public Review SelectById(int id2) {
		//return realisatorDAO.SelectById(id2);
		return repository.findById(id2).get();
	}

	@Override
	public List<Review> SelectAllReviews() { 
		return repository.findAll();
	}

	@Override
	public void insert(Review review) {
		repository.save(review);
		
	}



	
	
}
