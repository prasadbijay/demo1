package com.demo.repository.implem;

import javax.persistence.EntityManager;

import com.demo.module.UserOrganisation;
import com.repository.UserOrganisationRepository;
//import javax.persistence.EntityManager;

public class UserOrganisation2 implements UserOrganisationRepository{
	private final EntityManager etm;
	public UserOrganisation2 (EntityManager etm) {
		this.etm=etm;
	}
	@Override
	public UserOrganisation findById(int id) {
		// TODO Auto-generated method stub
		return etm.find(UserOrganisation.class,id);
	}
	
	@Override
	public void save(UserOrganisation s3) {
		// TODO Auto-generated method stub
		etm.persist(s3);
		
	}
	

}
