package org.bank;

public class Students {

	public void getStudentInfo()
	{ 
		System.out.println("getStudentInfo method without any parametres");
		
	}
	public void getStudentInfo(int id)
	{
		System.out.println("getStudentInfo method with only ID");
		System.out.println(id);
		
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("getStudentInfo method with ID and name Parameters");
		System.out.println("ID: " + id + "Name: " + name);
	}
	public void getStudentInfo(String email , int phoneNum)
	{
		System.out.println("getStudentInfo methods with email and phonenum");
		System.out.println("Email: " + email + "Phone Number: " + phoneNum);
	}
	public static void main(String[] args) 
	{
		Students s=new Students();
		s.getStudentInfo();
		s.getStudentInfo(12345);
		s.getStudentInfo(12356, "Divya");
		s.getStudentInfo("adc@xx.com", 456789433);

	}

}

