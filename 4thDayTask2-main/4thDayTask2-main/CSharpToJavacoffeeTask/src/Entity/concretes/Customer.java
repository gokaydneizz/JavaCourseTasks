package Entity.concretes;

import java.time.LocalDate;

import Entity.abstracts.Entity;

public class Customer implements Entity {
	int Id;
	String firstName;
	String lastName;
	LocalDate DateOfBirth;
	String NationalityId;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName,LocalDate DateOfBirth, String nationalityId) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.DateOfBirth = DateOfBirth;
		this.NationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
