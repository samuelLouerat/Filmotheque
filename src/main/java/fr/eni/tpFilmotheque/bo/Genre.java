package fr.eni.tpFilmotheque.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENRES")
public class Genre {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(length = 50, nullable = false)
	private String name;
	
	
	public Genre() {
		super();
	}
		public Genre(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Genre [id=" + id + ", name=" + name + "]";
	}
	
	

}
