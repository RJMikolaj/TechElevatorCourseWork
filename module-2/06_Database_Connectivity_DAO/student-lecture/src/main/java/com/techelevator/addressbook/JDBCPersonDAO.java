package com.techelevator.addressbook;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.test.context.jdbc.Sql;

public class JDBCPersonDAO implements PersonDAO {

		
private JdbcTemplate jdbcTemplate;

public JDBCPersonDAO(DataSource dataSource) {
	jdbcTemplate = new JdbcTemplate(dataSource);
	
}

@Override
public void save(Person person) {
	String sql = "INSERT INTO person (user_id, first_name, last_name) VALUES (DEFAULT, ?, ?) RETURNING user_id";
	SqlRowSet result = jdbcTemplate.queryForRowSet(sql, person.getFirstName(), person.getLastname());
	
	result.next();
	int id = result.getInt("user_id");
	person.setId(id);
}

@Override
public Person getPersonById(int id) {
	String sql = "SELECT user_id, first_name, last_name FROM person WHERE user_id = ?";
	SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);
	
	Person person = null;
	if (result.next()) {
		
	}
	return person;
}

@Override
public List<Person> getAllPersons() {
	String sql = "SELECT user_id, first_name, last_name FROM person";
	
	SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
	
	List<Person> allPersons = new ArrayList<Person>();
	
	while (result.next()) {
		allPersons.add(mapRowToPerson(result));
	}
	
	return allPersons;
}

private Person mapRowToPerson(SqlRowSet result) {
	Person p = new Person();
	p.setId(result.getInt("user_id"));
	p.setFirstName(result.getString("first_name"));
	p.setLastname(result.getString("last_name"));
	return p;
}


}
