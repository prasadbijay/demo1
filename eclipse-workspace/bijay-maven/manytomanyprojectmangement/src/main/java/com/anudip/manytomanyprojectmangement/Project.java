package com.anudip.manytomanyprojectmangement;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tcsproject")
public class Project
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int pid;
	@ManyToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="eid")
	List<Employee> employees;
	
@Column(name = "projectname",unique = true)
  private String pname;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Project() {
	
	// TODO Auto-generated constructor stub
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}


}
