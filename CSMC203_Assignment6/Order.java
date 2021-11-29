import java.util.ArrayList;

public class Order implements OrderInterface, Comparable<Order>{

	private int orderNum, orderTime;
	private DAY orderDay;
	private Customer cust;
	private ArrayList<Beverage>beverages;
	
	public int getOrderNum() {
		return orderNum;
	}
	
	public int getOrderTime() {
		return orderTime;
	}
	
	public DAY getOrderDay() {
		return orderDay;
	}
	
	public Customer getCustomer() {
		return new Customer(cust);
	}
	
	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}
		  
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}
	public void setOrderDay(DAY orderDay) {
		this.orderDay = orderDay;
	}
		
	public void setCustomer(Customer customer) {
		this.cust = customer;
	}
	
	public int compareTo(Order arg) {
		return 0;
	}
}
