package fr.eni.tpFilmotheque.bo;

public class Movie {

	private int id;
	private String title;
	private int duration;
	private String synopsis;
	private int releaseYear;
	
	public Movie() {
	}
	
	public Movie(String title, int duration, String synopsis, int releaseYear) {
		super();
		this.title = title;
		this.duration = duration;
		this.synopsis = synopsis;
		this.releaseYear = releaseYear;
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
