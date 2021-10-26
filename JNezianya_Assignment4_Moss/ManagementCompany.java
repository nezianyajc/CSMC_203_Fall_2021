public class ManagementCompany {
	
	private final int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private Property[] properties;
	private String name, taxID;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;

	
	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.plot = new Plot(0,0,10,10);
		this.properties = new Property[MAX_PROPERTY];
		
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(0,0,10,10);
		this.properties = new Property[MAX_PROPERTY];
		
	}
	
	
	public ManagementCompany(String propName, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = propName;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(x,y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = otherCompany.plot;
		this.properties = otherCompany.properties;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public void setMgmFee(double mgmFeePer) {
		this.mgmFeePer = mgmFeePer;
	}

	public void setPlot(Plot plot) {
		this.plot = new Plot(plot);
	}

	public String getName() {
		return name;
	}

	public String getTaxID() {
		return taxID;
	}

	public double getMgmFee() {
		return mgmFeePer;
	}

	public Plot getPlot() {
		return new Plot(plot);
	}
	
	
	
	public int addProperty(Property property) {
		int update = 0;

		Property unit = new Property(property);
		
		for (int j = 0; j < MAX_PROPERTY; j++) {
			properties[j] = property;
			
		 if(!unit.equals(null)) {
			 properties[j] = unit;
			 update = j;
		 } else if(property.equals(null)) {
			 update = -2;
		 } else if(properties.length == MAX_PROPERTY) {
			 update = -1;
		 } else if (properties[j].getPlot().overlaps(properties[0].getPlot())) {
			 update = -4;
		 } else if(properties[0].getPlot().encompasses(properties[j].getPlot())) {
			 update = -3;
		 }
			
		}
		return update;
		
	}
	
	public int addProperty(String name, String city, double rent, String owner) {
		int update = 0;

		Property unit = new Property(name, city, rent, owner);
		
		for (int j = 0; j < properties.length; j++) {
			
		 if(!properties[j].equals(null)) {
			 unit =  properties[j];
			 update = j;
		 } else if(unit.equals(null)) {
			 update = -2;
		 } else if(properties.length == MAX_PROPERTY) {
			 update = -1;
		 } else if (properties[j].getPlot().overlaps(properties[0].getPlot())) {
			 update = -4;
		 } else if(properties[0].getPlot().encompasses(properties[j].getPlot())) {
			 update = -3;
		 }
			
		}
		return update;
		
	}
	
	public int addProperty(String name, String city, double rent, String owner,
			int x, int y, int width, int depth) {
		int update = 0;

		Property unit = new Property(name, city, rent, owner, x, y, width, depth);
		
		for (int j = 0; j < properties.length; j++) {
			
		 if(!properties[j].equals(null)) {
			 unit =  properties[j];
			 update = j;
		 } else if(unit.equals(null)) {
			 update = -2;
		 } else if(properties.length == MAX_PROPERTY) {
			 update = -1;
		 } else if (properties[j].getPlot().overlaps(properties[0].getPlot())) {
			 update = -4;
		 } else if(properties[0].getPlot().encompasses(properties[j].getPlot())) {
			 update = -3;
		 }
			
		}
		return update;
		
	}
	
	public double totalRent() {
		Property unit = new Property();
		int total = 0;
		
		for(int j= 0; j < properties.length; j++) {
			properties[j] = unit;
			total += properties[j].getRentAmount();
		}
		
		return total;
	}
	
	private int maxRentPropertyIndex() {
		Property unit = new Property();
		
		int highInDex = 0;
		for(int j = 0; j < properties.length; j++) {
			properties[j] = unit;
			if(properties[0].getRentAmount() < properties[j].getRentAmount()) {
				highInDex = j;
			}
		}
		return highInDex;
	}
	
	public double maxRentProp() {
		double mosExpRent = 0;
		Property unit = new Property();
		
		for(int j=0; j < properties.length; j++) {
			 unit =  properties[j];
			if(properties[0].getRentAmount() < properties[j].getRentAmount()) {
				mosExpRent = properties[j].getRentAmount();
			}
		}
		return mosExpRent;
	}
	
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	public String toString() {
		String str = "";
		Property unit = new Property();
		
		for(int j = 0; j < properties.length; j++) {
			unit =  properties[j];
			str = properties[j].toString();
		}
		return str;
	}
	
	public Property[] getProperties() {
		return properties;
	}
		
	
	
}
