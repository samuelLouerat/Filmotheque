package fr.eni.tpFilmotheque.bo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "MOVIES")
public class Movie {
	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank
	@Column(length = 50, nullable = false)
	private String title;
	
	private int duration;
	private String synopsis;
	private String img;
	@Transient
	private int releaseYear;
	@Transient
	private List<Review> reviews;
	//@Transient
	@ManyToOne
	private Genre genre;
	//@Transient
	@ManyToMany(
	 fetch = FetchType.LAZY) //pas delete 
	@JoinTable(name="MovieActor", 
	           joinColumns= {@JoinColumn(name="movie_id")},
	           inverseJoinColumns= {@JoinColumn(name="actor_id")}
	)
	private List<Person> actor;
	@Transient
	private Person director;
	
	public Movie() {
	}
	
	public Movie(String title, int duration, String synopsis, int releaseYear) {
		super();
		this.title = title;
		this.duration = duration;
		this.synopsis = synopsis;
		this.releaseYear = releaseYear;
	}
	
	public Movie(String title, String synopsis) {
		super();
		this.title = title;

		this.synopsis = synopsis;
	}
	
	public Movie(@NotBlank String title, String synopsis, int releaseYear, List<Person> actor) {
		super();
		this.title = title;
		this.synopsis = synopsis;
		this.releaseYear = releaseYear;
		this.actor = actor;
	}
	
	public void setActor(Person actor) {
		this.actor.add(actor);
	}

	public List<Person> getActor() {
		return actor;
	}

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


	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
