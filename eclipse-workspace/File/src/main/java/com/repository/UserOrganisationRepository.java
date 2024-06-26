package com.repository;

import com.demo.module.UserOrganisation;

public interface UserOrganisationRepository {
	UserOrganisation findById(int id);
	void save(UserOrganisation s3); 

}
