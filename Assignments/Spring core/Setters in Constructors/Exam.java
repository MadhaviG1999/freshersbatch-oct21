package com.Setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");	
		Student gow = context.getBean("student",Student.class);
		gow.displayStudentInfo();
		
		Student ravi= context.getBean("ravi",Student.class);
		ravi.displayStudentInfo();
		

	}

}
