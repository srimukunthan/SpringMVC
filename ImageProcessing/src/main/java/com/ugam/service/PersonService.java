package com.ugam.service;

import java.util.List;
import com.ugam.model.UserModel;

public interface PersonService {

	public void addPerson(UserModel user);
	public void updatePerson(UserModel user);
	public List<UserModel> listPersons();
	public UserModel getPersonById(int id);
	public void removePerson(int id);
	
}
