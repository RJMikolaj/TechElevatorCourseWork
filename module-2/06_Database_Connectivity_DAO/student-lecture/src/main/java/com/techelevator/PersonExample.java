package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;

import javax.sql.DataSource;

import com.techelevator.addressbook.JDBCPersonDAO;
import com.techelevator.addressbook.Person;
import com.techelevator.addressbook.PersonDAO;

public class PersonExample {

	public static void main(String[] args) {
	
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");
		
		PersonDAO dao = new JDBCPersonDAO(dataSource);
		
		Person person = new Person();
		person.setFirstName("Doug");
		person.setLastname("Smith");
		
		dao.save(person);
		Person newPerson = dao.getPersonById(person.getId());
		
		System.out.println(newPerson);
		
		List<Person> allPersons = dao.getAllPersons();
		for (Person person2 : allPersons) {
			}
		}

}
