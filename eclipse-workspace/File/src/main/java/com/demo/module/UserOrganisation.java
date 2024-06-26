package com.demo.module;
import javax.persistence.*;
@Entity
@Table(name="UserOrganisation")
public class UserOrganisation {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int Or_id;
	private String Or_name;
	private Organisation organisation;
	@OneToOne(mappedBy="userorganition",cascade=CascadeType.ALL)
	public int getOr_id() {
		return Or_id;
	}
	public void setOr_id(int or_id) {
		Or_id = or_id;
	}
	public String getOr_name() {
		return Or_name;
	}
	public void setOr_name(String or_name) {
		Or_name = or_name;
	}
	public void setOrganisation1(Organisation organisation) {
		this.organisation = organisation;
		
	}
	
	

}
