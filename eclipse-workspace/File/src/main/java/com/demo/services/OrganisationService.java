package com.demo.services;

import com.repository.UserOrganisationRepository;
import com.demo.module.Organisation;
import com.demo.module.UserOrganisation;
import com.repository.OrganitionRepository;

public class OrganisationService {
	private final OrganitionRepository s1;
	private final UserOrganisationRepository s2;
	public OrganisationService(OrganitionRepository s1,UserOrganisationRepository s2) {
		this.s1=s1;
		this.s2=s2;
	}
	public void userWithProfile(Organisation s,UserOrganisation s3) {
		s.setUserOrganisation(s3);
		s3.setOrganisation1(s);
		s1.save(s);
		s2.save(s3);
		
	}

	

}
