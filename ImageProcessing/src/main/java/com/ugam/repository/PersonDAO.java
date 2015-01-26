package com.ugam.repository;

import java.util.List;

import com.ugam.model.PersonModel;

public interface PersonDAO {

	public void addPerson(PersonModel person);
	public void updatePerson(PersonModel person);
	public List<PersonModel> listPersons();
	public PersonModel getPersonById(int id);
	public void removePerson(int id);
	public boolean authenticateUser(PersonModel personModel);
}
