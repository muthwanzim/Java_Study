package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer Kim = new Customer(10001, "Kim");
		Customer Lee = new Customer(10002, "Lee");
		Customer Park = new GoldCustomer(10003, "Park");
		Customer Choi = new GoldCustomer(10004, "Choi");
		Customer Jeong = new VIPCustomer(10005, "Jeong", 100);
		
		customerList.add(Kim);
		customerList.add(Lee);
		customerList.add(Park);
		customerList.add(Choi);
		customerList.add(Jeong);
		
		System.out.println("======= Customer info ========");
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("======= Discount rate and point ======");
		int price = 10000;
		for (Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + " paid" + cost);
			System.out.println(customer.showCustomerInfo());
		}
	}

}
