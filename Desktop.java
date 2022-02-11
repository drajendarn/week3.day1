package org.system;

public class Desktop extends Computer
{

	public void desktopSize()
	{
	computerModel();
	System.out.println("desktopSize Model method created in Computer class");	
	}
	
public static void main(String[] args) {
	
	Desktop obj=new Desktop();
	obj.desktopSize();
}
	}
