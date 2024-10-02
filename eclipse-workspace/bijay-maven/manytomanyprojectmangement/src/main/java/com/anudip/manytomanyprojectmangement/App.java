package com.anudip.manytomanyprojectmangement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.graph.CannotContainSubGraphException;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration conf=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Project.class);
    	SessionFactory sFactory=conf.buildSessionFactory();
    	Session session=sFactory.openSession();
    	Transaction t1=session.beginTransaction();
    	List<Employee> employees=new ArrayList<>();
    	List<Project> projects=new ArrayList<>();
    	Employee e1=new Employee();
    	e1.setEname("Hrishikesh");
    	
    	Employee e2=new Employee();
    	e2.setEname("Omkar");
    	employees.add(e1);
    	employees.add(e2);
    	
    	Project p1=new Project();
    	p1.setPname("Hospital management");
    	Project p2=new Project();
    	p2.setPname("Hotel management");
    	projects.add(p1);
    	projects.add(p2);
        e1.setProjects(projects);
        e2.setProjects(projects);
        p1.setEmployees(employees);
        p2.setEmployees(employees);
        session.persist(e1);
        session.persist(e2);
      //  session.persist(p2);
        t1.commit();
    }
}
