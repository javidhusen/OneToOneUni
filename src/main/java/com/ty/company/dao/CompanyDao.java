package com.ty.company.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.company.dto.Company;

public class CompanyDao {

	public Company getCompanyByGst(String gst) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
				
		
		return null;
		
	}
}
