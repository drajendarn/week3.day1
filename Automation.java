package org.bank;

public class Automation extends MultipleLanguage implements Language,TestTool

{

	String lang = "";
	final String color="white"; 
	static String skill="Selenium WebDriver";

	@Override
	public void selenium() {
		System.out.println("implements Selenium method created in Language interface");
		System.out.println(skill);
		
	}
	@Override
	public void java(String lang)
	{
		System.out.println("implements java method created in TestTool interface");
		this.lang="Java ";
		
	}
		
	final void ruby()
	 {
		  
		 System.out.println("Ruby method created abstarct class");
		 System.out.println("Sub class: " + color);
		 System.out.println("Super class: " + super.color);
	 }
	 
	 public static void main(String[] args) {
		
		Automation a=new Automation();
		a.java("language");
		a.selenium();
		a.ruby();
		
	}

	

}
