package fr.eni.tpFilmotheque.bo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "REVIEWS")
public class Review {
	@Id
	@GeneratedValue
	private Integer id;
	private String comment;
	private int rating;
	private LocalDate date;
	@Transient
	private Person redactor;
	

	public Review() {
		super();
	}
	public Person getRedactor() {
		return redactor;
	}
	public void setRedactor(Person redactor) {
		this.redactor = redactor;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
