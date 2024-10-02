package com.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="patiant_Appointment")
public class Patiant {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int pId;
	private String fullName;
	private String location;
	private double contactNumber;
	private String speciality;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Demo doctors;
	
	public Patiant() {
		
	}
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(double contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public Demo getDoctors() {
		return doctors;
	}
	public void setDoctors(Demo doctors) {
		this.doctors = doctors;
	}
	
	

}
