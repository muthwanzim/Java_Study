package Inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

		/*
		Customer Kim = new Customer();
		Kim.setCustomerID(1001);
		Kim.setCustomerName("Kim");
		*/
		
		VIPCustomer Lee = new VIPCustomer(1002, "Lee", 100);
		// Lee.setCustomerID(1002);
		// Lee.setCustomerName("Lee");
		
		Lee.bonusPoint = 1000;
		
		//System.out.println(Kim.showCustomerInfo());
		System.out.println(Lee.showCustomerInfo());
	}

}
