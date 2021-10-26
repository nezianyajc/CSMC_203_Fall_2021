
public class Property {
	
	private String city, owner, propertyName;
	private double rentAmount;
	private Plot plot;
	
	public Property() {
		this.city = "";
		this.owner = "";
		this.propertyName = "";
		this.rentAmount = 0.0;
		this.plot = new Plot();
	}

	public Property(String propertyName, String city,double rentAmount,String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city,double rentAmount,String owner, int x, 
			int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x,y, width, depth);
	}
	
	public Property(Property p) {
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentAmount = p.rentAmount;
		this.plot = p.plot;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public void setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x, y, width, depth);
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public String toString() {
		String str = " Property Name: " + propertyName + "\n" + " Located in: " + city + "\n" + "Belonging to: " + owner
				+ "\n" + " Rent Amount: " + rentAmount + " ";
		return str;
	}
	
	
}
