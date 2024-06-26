package com.manytomany;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = " course_id")
	private Long id;
	@Column (name="name")
	private String name;
	@ManyToMany(mappedBy ="courses")
	private Set<Student> s=new HashSet<>();
	
	public Course(Long id, String name, Set<Student> s) {
		super();
		this.id = id;
		this.name = name;
		this.s = s;
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getS() {
		return s;
	}
	public void setS(Set<Student> s) {
		this.s = s;
	}
	

}
