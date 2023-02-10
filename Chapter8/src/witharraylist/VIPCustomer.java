package witharraylist;

public class VIPCustomer extends Customer {

	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		// System.out.println("VIPCustomer(int, String) Load");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		double discount = price * saleRatio;
		price -= discount;
		return price;
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " Agent is" + agentID;
	}

	
}
