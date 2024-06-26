package com.manytomany;
import javax.persistence.*;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory em=Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager e=em.createEntityManager();
		EntityTransaction t=e.getTransaction();
		t.begin();
		Student s1=new Student();
		s1.setName("Alice");
		Course c1=new Course();
		c1.setName("math");
		s1.getC().add(c1);
		c1.getS().add(s1);
		
		
		e.getTransaction().begin();
		e.persist(s1);
		e.persist(c1);
		e.getTransaction().commit();
		
		Student rt=e.find(Student.class,s1.getId());
		System.out.println(" students "+rt.getName());
		System.out.println("courses: ");
		for(Course c2:rt.getC()) {
			System.out.println(c2.getName());
			}
		e.close();
		em.close();

	}

}
