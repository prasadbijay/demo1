package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c=new Configuration().configure().addAnnotatedClass(Demo.class).addAnnotatedClass(Patiant.class);
		SessionFactory ss=c.buildSessionFactory();
		Session s=ss.openSession();
		Transaction t1=s.beginTransaction();
		Demo d1=new Demo();
		Patiant p1=new Patiant();
		d1.setName("Anju");
		d1.setContact(0212123132);
		d1.setQualification("MBBS");
		d1.setSpeciality("to give heart-attack");
		List<Patiant> patiants=new ArrayList<>();
		p1.setFullName("bijay");
		p1.setContactNumber(493223232);
		p1.setDoctors(d1);
		p1.setLocation("assam");
		p1.setSpeciality("heart-patiant");
		patiants.add(p1);
		d1.setPatiants(patiants);
		s.save(d1);
		t1.commit();
		s.close();
		
		

	}

}
