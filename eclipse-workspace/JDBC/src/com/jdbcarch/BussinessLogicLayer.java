package com.jdbcarch;

public class BussinessLogicLayer {
	private DataAccessLayer dataAccess= new DataAccessLayer();
	public String getEmployeeNameById(int eid) {
		return dataAccess.getEmployeeNameById(eid);
	}


}
