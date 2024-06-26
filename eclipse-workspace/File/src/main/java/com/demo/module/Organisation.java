package com.demo.module;
import javax.persistence.*;
@Entity
@Table(name="Organisation")

public class Organisation {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int O_id;
	private int Resister;
	private String Organize_name;
	private String Organize_Location;
	private UserOrganisation userOrganisation ;
	
	@OneToOne(mappedBy="organisation",cascade=CascadeType.ALL)
	public int getO_id() {
		return O_id;
	}
	
	public void setO_id(int o_id) {
		O_id = o_id;
	}
	public int getResister() {
		return Resister;
	}
	public void setResister(int resister) {
		Resister = resister;
	}
	public String getOrganize_name() {
		return Organize_name;
	}
	public void setOrganize_name(String organize_name) {
		Organize_name = organize_name;
	}
	public String getOrganize_Location() {
		return Organize_Location;
	}
	public Organisation(int o_id,int resister_no,String o_name,String o_location) {
		this.O_id=o_id;
		this.Resister=resister_no;
		this.Organize_name=o_name;
		this.Organize_Location=o_location;
	}
	public void setOrganize_Location(String organize_Location) {
		Organize_Location = organize_Location;
	}
	public void setUserOrganisation(UserOrganisation userOrganisation) {
		this.userOrganisation= userOrganisation;
	}


}
