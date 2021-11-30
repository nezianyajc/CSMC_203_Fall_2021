import java.util.ArrayList;

public class BevShop implements BevShopInterfce {
	private int currNumOfDrinks, currOrderId;
	private ArrayList<Order> orders = new ArrayList<Order>();
	
	public BevShop() {
		this.orders = new ArrayList<>();
	}
	
	public String toString() {
		String str = "Orders for the month";
		for (Order ord : orders) {
			str += ord.toString();
		}
		str += "Total: " +totalMonthlySale();
			  
		return str;
	}
	
	  
	public boolean validTime(int time) {
		if (time >= MIN_TIME && time <= MAX_TIME) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validAge(int age) {
		if (age > MIN_AGE_FOR_ALCOHOL) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean eligibleForMore() {
		if (currNumOfDrinks < 3) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isMaxFruit(int num) {
		if (num > MAX_FRUIT) {
			return true;
		} else {
		return false;
		}
	}
	
	public void startNewOrder(int time, DAY day, String name, int age) {
		Customer customer = new Customer(name, age);
		Order order = new Order(time, day, customer);
		orders.add(order);
		currNumOfDrinks = 0;
		currOrderId = orders.indexOf(order);
	}
	
	public void processAlcoholOrder(String bevName, SIZE size) {
		orders.get(currOrderId).addNewBeverage(bevName, size);
		currNumOfDrinks++;
	}
	
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
		orders.get(currOrderId).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		orders.get(currOrderId).addNewBeverage(bevName, size, extraShot, extraSyrup);
	}
	
	public int findOrder(int orderNum) {
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getOrderNo() == orderNum) {
					return i;
			}
		} 
		  return -1;
	}
	
	public double totalOrderPrice(int orderNum) {
		double sale = 0;
		  
		for (Order ord : orders) {
			if (ord.getOrderNo() == orderNum) {
				for (Beverage bev : ord.getBeverages()) {
					sale += bev.calcPrice();
				}
			}
		}
		  
		return sale;
		}
	
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}
	
	public void sortOrders() {
		  for (int i = 0; i < orders.size()- 1; i++) {
			  int minOrdId = i;
			  for (int j = i + 1; j < orders.size(); j++) {
				  if (orders.get(j).getOrderNo() < orders.get(minOrdId).getOrderNo()) {
					  minOrdId = j;
				  }
			  }
			  
			  	Order ticket = orders.get(minOrdId);
				orders.set(minOrdId, orders.get(i));
				orders.set(i, ticket);
		  }
	}
	
	public double totalMonthlySale() {
		double total = 0;
		  
		for (Order ord : orders) {
			for (Beverage bev : ord.getBeverages()) {
				total += bev.calcPrice();
			}
		}
		  
		return total;
	}
	
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	public Order getCurrentOrder() {
		return orders.get(currOrderId);
	}
	
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	public int getNumOfAlcoholDrink() {
		return currNumOfDrinks;
	}
	
	
	
}
		  
