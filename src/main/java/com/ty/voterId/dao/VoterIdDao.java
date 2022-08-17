package com.ty.voterId.dao;

import java.awt.datatransfer.SystemFlavorMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.voterId.dto.Person1;
import com.ty.voterId.dto.VoterId;

public class VoterIdDao {

	void savePerson1() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person1 person = new Person1();
		person.setName("monu");
		person.setAge(25);
		
		VoterId voterid = new VoterId();
		voterid.setFatherName("sonu");
		voterid.setNumber("ms8547");
		
		person.setVoter(voterid);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(voterid);
		entityTransaction.commit();
	}
}
