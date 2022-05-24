package fr.eni.tpFilmotheque.bo;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
@Entity
@Table(name = "PERSONS")
public class Person {
	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank
	@Column(length = 50, nullable = false)
	private String lastName;
	@NotBlank
	@Column(length = 50, nullable = false)
	private String firstName;
	@Past
	private LocalDate dateDeNaissance;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(Integer id, @NotBlank String lastName, @NotBlank String firstName) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public Person(@NotBlank String lastName, @NotBlank String firstName) {
		super();

		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
}
