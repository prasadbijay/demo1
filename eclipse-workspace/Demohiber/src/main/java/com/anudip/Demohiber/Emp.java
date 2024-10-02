package com.anudip.Demohiber;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emp {
    public static void main(String[] args) {
        Configuration con1 = new Configuration().configure().addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = con1.buildSessionFactory();
        Session ss = sessionFactory.openSession();
        Transaction t1 = ss.beginTransaction();
        
        Student s1 = new Student();
        s1.setSid(101);
        s1.setSname("Avinash");
        s1.setSemail("Avinash@gmail.com");
        s1.setScontact("9898123321");
        
        ss.save(s1);
        t1.commit();
        
        // Close the session and factory
        ss.close();
        sessionFactory.close();
    }
}