package com.ugam.repository;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ugam.model.PersonModel;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private JdbcTemplate simpleJdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.simpleJdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void addPerson(PersonModel person) {
		String sql = "INSERT INTO user_mater " +
				"(user_name, password, role) VALUES (?, ?, ?)";
		int rowcount = simpleJdbcTemplate.update(sql,new Object[] { person.getUserName() , person.getPassword(), person.getRole() });
		System.out.println(rowcount);
	}

	@Override
	public void updatePerson(PersonModel p) {
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
