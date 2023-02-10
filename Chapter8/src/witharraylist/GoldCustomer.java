package witharraylist;

public class GoldCustomer extends Customer{

	double saleRatio;
	
	
	public GoldCustomer() {
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
		// System.out.println("Customer() Load");
	}
	
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	
}
