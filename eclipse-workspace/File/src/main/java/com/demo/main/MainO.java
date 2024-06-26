package com.demo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.controller.OrganisationController;
import com.demo.module.Organisation;
import com.demo.module.UserOrganisation;
import com.demo.repository.implem.Organisation1;
import com.demo.repository.implem.UserOrganisation2;
import com.demo.services.OrganisationService;
import com.repository.OrganitionRepository;

public class MainO {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em=emf.createEntityManager();
	
		
		OrganitionRepository obj =new Organisation1(em);
		UserOrganisation2 ob = new UserOrganisation2(em);
		OrganisationService os = new OrganisationService(obj,ob);
		OrganisationController oc = new OrganisationController(os);
		Organisation org = new Organisation(1, 213232,"Titanic" , "Pune");
		org.setOrganize_name("Trushal");
		org.setOrganize_Location("Pune");
		org.setO_id(1);
		org.setResister(1133272);
		
		UserOrganisation uo = new UserOrganisation();
		uo.setOr_id(1);
		uo.setOr_name("trushal");
		
		em.getTransaction().begin();
		oc.creatWithProfile(org, uo);
		em.getTransaction().commit();
		em.close();
		emf.close();	
		
		
		


	}

}
