package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("StudentName  Name method in Student class");
	}
	public void studentid()
	{
		System.out.println("studentid  Name method in Student class");
	}
	public void studentdept()
	{
		System.out.println("studentdepartent  Name method in Student class");
	}

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.collegeCode();
	    obj.collegeName();
	    obj.collegeRank();
	    obj.deptName();
	    obj.studentName();
	    obj.studentdept();
	    obj.studentid();
	
	
	}
	
}