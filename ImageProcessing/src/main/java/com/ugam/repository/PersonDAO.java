package com.ugam.repository;

import java.util.List;

import com.ugam.model.UserModel;

public interface PersonDAO {

	public void addPerson(UserModel p);
	public void updatePerson(UserModel p);
	public List<UserModel> listPersons();
	public UserModel getPersonById(int id);
	public void removePerson(int id);
}
