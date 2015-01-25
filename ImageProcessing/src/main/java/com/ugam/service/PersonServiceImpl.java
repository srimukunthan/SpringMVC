package com.ugam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ugam.repository.*;
import com.ugam.model.PersonModel;
@Service
public class PersonServiceImpl implements PersonService {
	
	private PersonDAO personDAO;
	@Autowired
	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	@Override
	public void addPerson(PersonModel user) {
		this.personDAO.addPerson(user);		
	}
	@Override
	public void updatePerson(PersonModel user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<PersonModel> listPersons() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PersonModel getPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		
	}


}
