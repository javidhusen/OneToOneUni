package com.ty.company.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.company.dto.Company;
import com.ty.company.dto.Gst;

public class TestCompanySave {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company = new Company();
		company.setName("TestYantra");
		company.setPhone(9854671235l);
		
		Gst gst = new Gst();
		gst.setGstNumber("TY25479931");
		gst.setStatus("Active");
		
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
		
		entityTransaction.begin();
		entityManager.persist(gst);
		entityTransaction.commit();
			
	}

}
