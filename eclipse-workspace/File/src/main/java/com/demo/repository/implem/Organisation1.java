package com.demo.repository.implem;

import com.demo.module.Organisation;
import com.repository.OrganitionRepository;
import javax.persistence.EntityManager;

public class Organisation1 implements OrganitionRepository{
	private final EntityManager etm;
	public Organisation1(EntityManager etm) {
		this.etm=etm;
	}
	@Override
	public Organisation findById(int id) {
		// TODO Auto-generated method stub
		return etm.find(Organisation.class, id);
	}
	@Override
	public void save(Organisation or) {
		// TODO Auto-generated method stub
		etm.persist(or);
		
	}



}
