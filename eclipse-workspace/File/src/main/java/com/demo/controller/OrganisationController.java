package com.demo.controller;

import com.demo.module.Organisation;
import com.demo.module.UserOrganisation;
import com.demo.services.OrganisationService;

;

public class OrganisationController {
	private final OrganisationService service;
	public OrganisationController(OrganisationService service) {
		this.service=service;
	}
	public void creatWithProfile(Organisation o,UserOrganisation n) {
		service.userWithProfile(o,n);
		System.out.println(" user created successfully: ");
	}

}
