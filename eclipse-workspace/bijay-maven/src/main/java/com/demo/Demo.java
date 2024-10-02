package com.demo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Demo {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;	
	private String name;
	private String speciality;
	private String qualification;
	private double contact;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pId")
	private List <Patiant> patiants;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getContact() {
		return contact;
	}
	public void setContact(double contact) {
		this.contact = contact;
	}
	
	
	public List<Patiant> getPatiants() {
		return patiants;
	}
	public void setPatiants(List<Patiant> patiants) {
		this.patiants = patiants;
	}
	public Demo() {
		
	}
	
	
	

}
