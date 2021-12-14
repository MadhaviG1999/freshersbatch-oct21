package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Examm {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beanss.xml");	
		Studentt abhi = context.getBean("student",Studentt.class);
		abhi.displayStudentInfo();
		
		
	}

}
