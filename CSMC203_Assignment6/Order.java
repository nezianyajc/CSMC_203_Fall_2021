// CSMC203 Assignment-6 11-29-21

import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order>{

	private int orderNum, orderTime;
	private DAY orderDay;
	private Customer cust;
	private ArrayList<Beverage> beverages = new ArrayList<Beverage>();
	
	//Constructor
	public Order(int orderTime, DAY orderD, Customer customer) {
		this.orderNum = orderNumGenerator();
		this.orderTime = orderTime;
		this.orderDay = orderD;
		this.cust = customer;
	}
	
	public int orderNumGenerator() {
		return (int) ((Math.random() * (90000 -10000)) + 10000);
	}
	
	public int getOrderNo() {
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
		  
	public void setOrderNum(int orderN) {
		orderNum = orderN;
	}
	
	public void setOrderTime(int orderT) {
		orderTime = orderT;
	}
	public void setOrderDay(DAY orderD) {
		orderDay = orderD;
	}
		
	public void setCustomer(Customer customer) {
		cust = customer;
	}
	
	
	public String toString() {
		String str = orderTime + "___"
		+ orderDay.toString() + " " +" Order Num: " +orderNum
		+"\n" + cust.toString();
		  
		for (Beverage beverage : beverages) {
			str += " " +beverage.toString();
		}
		str += " Total: " +calcOrderTotal();
		  
		return str;
		}
	
	public boolean isWeekend() {
		if (orderDay == DAY.SUNDAY || orderDay == DAY.SATURDAY) {
			return true;
		} else {
			return false;
		}
	}
	
	public Beverage getBeverage(int ordNum) {
		return beverages.get(ordNum);
	}
	
	public int compareTo(Order order) {
		if (orderNum == order.getOrderNo()) {
			return 0;
		} else if (orderNum > order.getOrderNo()) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public double calcOrderTotal() {
		double orderTotal = 0.0;
		  
		for (Beverage bev : beverages) {
			orderTotal += bev.calcPrice();
		}
		  
		return orderTotal;
	}
	
	public int findNumOfBeveType(TYPE type) {
		int count = 0;
		  
		for (Beverage bev : beverages) {
		if (bev.getType() == type) {
			count++;
			}
		}
		return count;
	}
		
	public int getTotalItems() {
		return beverages.size();
	}
	
	public void addNewBeverage(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
		Coffee coffee = new Coffee(name, size, extraShot, extraSyrup);
		beverages.add(coffee);
	}
	
	public void addNewBeverage(String name, SIZE size, int numOfFruit, boolean proteinPowder) {
		Smoothie smoothie = new Smoothie(name, size, numOfFruit, proteinPowder);
		beverages.add(smoothie);
	}
	
	public void addNewBeverage(String name, SIZE size) {
		boolean theWeekend = false;
		if (orderDay == DAY.SUNDAY || orderDay == DAY.SATURDAY) {
			theWeekend = true;
		}
		Alcohol alcohol = new Alcohol(name, size, theWeekend);
		beverages.add(alcohol);
	}
	
	
	
}
