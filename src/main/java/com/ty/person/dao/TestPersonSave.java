package com.ty.person.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.person.dto.Pan;
import com.ty.person.dto.Person;

public class TestPersonSave {

	public static void main(String[] args) {

		EntityManagerFactory factory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("dimple");
		person.setAge(24);
		
		Pan pan =new Pan();
		pan.setPanNumber("BZNPJ7745J");
		pan.setFatherName("Raju");
		
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
		entityTransaction.begin();
		entityManager.persist(pan);
		entityTransaction.commit();
	}

}
