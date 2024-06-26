package com.manytomany;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table (name="studentss")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="student_id")
	private Long id;
	@Column (name="name")
	private String name;
	@ManyToMany
	@JoinTable(name="student_course",joinColumns=@JoinColumn(name="student_id"),
	inverseJoinColumns=@JoinColumn (name="course_id"))
	private Set<Course> c= new HashSet<>();
	public Student(Long id, String name, Set<Course> c) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
	}
	public Student() {
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
	public Set<Course> getC() {
		return c;
	}
	public void setC(Set<Course> c) {
		this.c = c;
	}
	

}
