package com.Setters;

public class Student {
private String studentName;
private int id;

public void setStudentName(String studentName) {
	this.studentName=studentName;
}


public void setId(int id) {
	this.id = id;
}


public void displayStudentInfo() {
	System.out.println("student name is "+ studentName  + " and id is : " + id);
}


}
