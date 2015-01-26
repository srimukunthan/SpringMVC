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

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void addPerson(PersonModel person) {
		String sql = "INSERT INTO user_mater " +
				"(user_name, password, role) VALUES (?, ?, ?)";
		int rowcount = jdbcTemplate.update(sql,new Object[] { person.getUserName() , person.getPassword(), person.getRole() });
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
//		String sql = "selcet * from user_master where user_id = ?";
//		personModel = simpleJdbcTemplate.queryForInt(sql, id );
//		PersonModel personModel = new PersonModel(null, null, null);
		return null;
	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean authenticateUser(PersonModel personModel) {
		boolean status = false;
		String sql = "select count(*) from user_mater where user_name=? and password=?";
		int rowcount = jdbcTemplate.queryForInt(sql,personModel.getUserName() , personModel.getPassword());
		status = (rowcount > 0 ? true : status);
		return status;
	}
}
