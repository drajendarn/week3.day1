package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Deposit method created in SUbcalss AxisBank");
		
	}

	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.deposit();
		obj.fixed();
	}

}
