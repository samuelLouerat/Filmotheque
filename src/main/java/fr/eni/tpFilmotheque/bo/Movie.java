package fr.eni.tpFilmotheque.bo;

import java.util.List;

public class Movie {

	private int id;
	private String title;
	private int duration;
	private String synopsis;
	private String img;
	private int releaseYear;
	private List<Review> reviews;
	private Genre genre;
	private List<Person> actor;
	private Person director;
	
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Movie() {
	}
	
	public Movie(String title, int duration, String synopsis, int releaseYear) {
		super();
		this.title = title;
		this.duration = duration;
		this.synopsis = synopsis;
		this.releaseYear = releaseYear;
	}
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", duration=" + duration + ", synopsis=" + synopsis
				+ ", releaseYear=" + releaseYear + "]";
	}
	
	
}
