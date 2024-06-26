package com.point;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
public static  void main(String args[]) {
	ClassPathResource r = new ClassPathResource("aplicationcontext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	
	Student s =(Student)factory.getBean("studnetbean");
	s.displayInfo();
}
}

