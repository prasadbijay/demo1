package com.manytoone;

import javax.persistence.EntityManager;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainM {
	private static EntityManagerFactory entityManagerFoctory;
	private static EntityManager entityManager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			entityManagerFoctory=Persistence.createEntityManagerFactory("my-persistence-unit");
			entityManager=entityManagerFoctory.createEntityManager();
			departEmp();
			//readDepart();
			//updatedDepart();
			//deleteDepart();
		}
		finally{
			if(entityManager!=null) {
				entityManager.close();
			}
			if(entityManagerFoctory!=null) {
				entityManagerFoctory.close();
			}
		}

	}
	private static void departEmp() {
		entityManager.getTransaction().begin();
		Department d1 =new Department();
		d1.setD_name("Engeneerig: ");
		Employee e1=new Employee();
		e1.setE_name("Bijay");
		e1.setDepartment(d1);
		e1.setSalary(400000);
		Employee e2=new Employee();
		e2.setE_name("Ankush: ");
		e2.setDepartment(d1);
		e2.setSalary(50000);
		d1.setEmployee(Arrays.asList(e1,e2));
		entityManager.persist(d1);
		entityManager.getTransaction().commit();
	}
	}


