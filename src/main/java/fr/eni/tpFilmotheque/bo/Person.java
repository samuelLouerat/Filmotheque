package fr.eni.tpFilmotheque.bo;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

public class Person {

	private int id;
	@NotBlank
	private String lastName;
	@NotBlank
	private String firstName;
	@Past
	private LocalDate dateDeNaissance;
	
	
	
	
	
	
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
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
