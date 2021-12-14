package com.Constructor;

public class Studentt {
	private int idno;
	private String studentNamee;

	
	public Studentt(int idno,String studentNamee)
	{
		this.idno=idno;
		this.studentNamee=studentNamee;
		
	}
	public Studentt(int idno)
	{
		this.idno=idno;
		
	}
	
	

public void displayStudentInfo() {
	System.out.println("student name is "+ studentNamee  + " and id is : " + idno);
}

}
