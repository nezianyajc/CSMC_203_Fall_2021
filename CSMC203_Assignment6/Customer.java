// CSMC203 Assignment-6 11-29-21

public class Customer {
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Customer(Customer customer) {
		this.name = customer.getName();
		this.age = customer.getAge();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	  
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	  
	public String toString() {
		return name +" " + " age " + age;
	}
	
	
}
