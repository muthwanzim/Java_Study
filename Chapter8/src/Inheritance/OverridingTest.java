package Inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		/*
		Customer Choi = new Customer(10001, "Choi");
		int price = Choi.calcPrice(10000);
		System.out.println(price + " " + Choi.showCustomerInfo());
		
		VIPCustomer Lee = new VIPCustomer(10001, "Lee", 100);
		price = Lee.calcPrice(10000);
		System.out.println(price + " " + Lee.showCustomerInfo());
		*/
		
		Customer Who = new VIPCustomer(10002, "Who", 100);
		int price = Who.calcPrice(10000);
		System.out.println(price + " " + Who.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}

}
