package com.repository;

import com.demo.module.Organisation;

public interface OrganitionRepository {
	Organisation findById(int id);
	void save(Organisation or) ;
	

}
