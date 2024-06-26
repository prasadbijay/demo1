package com.manytoone;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int E_id;
	private double salary;
	private String E_name;
	@ManyToOne
	@JoinColumn(name="d_id")
	private Department department;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return E_id;
	}
	public void setId(int id) {
		this.E_id = id;
	}
	public Employee() {
	this.E_id = E_id;
	this.E_name = E_name;
	this.salary=salary;
	this.department=department;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public void setDepartment(Department department) {
		this.department=department;
	}

}
