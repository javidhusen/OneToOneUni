package com.ty.person.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.person.dto.Person;

public class PersonDao {

	public Person getPersonById(int id) {
		
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = factory.createEntityManager();
		
	Person person = entityManager.find(Person.class, id);
	String jpql = "SELECT p FROM Person p WHERE p.id=?1";
	
	Query query = entityManager.createQuery(jpql);
	return person;
	}
}
