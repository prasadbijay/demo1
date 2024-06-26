package com.bussiness;
import com.data.Employee;
import com.model.*;
public class BussinessLogicLayer {
	private DataAcess da = new DataAcess();
	public void Emp(int employeeId,String employeeName) {
		
		
	}
	
	public void deleteEmp(int eid) {
		da.deleteEmp(eid);
		System.out.println(" delete successfully: ");
	}
	
	public void addEmp(String employeeName) {
		da.addEmp(employeeName);
		System.out.println("employee add successfully:");
	}
	
	public void viewEmp() {
		Employee employee = da.getEmployeeById();
		if(employee!=null) {
			System.out.println("employee id: "+employee.getEmployeeId());
			System.out.println("employee name: "+employee.getEmployeeName());
		}else {
			System.out.println("employee not found: ");
		}
	}
	
}
       