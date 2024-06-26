package com.manytoone;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.*;
@Entity
@Table(name="Department")
public class Department {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String d_name;
	@OneToMany(mappedBy = "department", cascade=CascadeType.ALL)
	private List<Employee> emp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public Department() {
		super();
		this.id = id;
		this.d_name = d_name;
	}
	public List<Employee> getEmployee(){
		return emp;
	}
	public void setEmployee(List<Employee>emp) {
		this.emp=emp;
	}
	
	
}
