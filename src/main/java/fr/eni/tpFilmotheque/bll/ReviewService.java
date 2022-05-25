package fr.eni.tpFilmotheque.bll;

import java.util.List;

import fr.eni.tpFilmotheque.bo.Person;
import fr.eni.tpFilmotheque.bo.Review;

public interface ReviewService {

	Review SelectById(int id);
	
	List<Review> SelectAllReviews();
	
	void insert(Review review);
}
