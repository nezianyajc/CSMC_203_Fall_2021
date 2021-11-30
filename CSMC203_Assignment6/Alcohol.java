// CSMC203 Assignment-6 11-29-21

public class Alcohol extends Beverage {
	private boolean theWeekend;
	private final double WEEKEND_FEE = .6;
	
	public boolean getIsWeekend() {
		return theWeekend;
	}
	
	public double getWeekendFee() {
		return WEEKEND_FEE;
	}
		  
	public void setIsWeekend(boolean weekend) {
		theWeekend = weekend;
	}
	
	
	public Alcohol(String name, SIZE size, boolean weekend){
		super(name, TYPE.ALCOHOL, size);
		this.theWeekend = weekend;
	}
	
	public String toString() {
		String str = getBevName() + " " +getSize();
		  
		if (theWeekend) {
			str += " the weekend";
		}
		str += " $" +calcPrice();
		return str;
		
	}
	
	public boolean equals(Alcohol beer) {
		if (super.equals(beer) && theWeekend == beer.getIsWeekend()) {
			return true;
		} else {
			return false;
			}
	}	
	
	public double calcPrice() {
		double price = super.getBasePrice();
		  
		if (super.getSize() == SIZE.MEDIUM) {
			price += super.getSizePrice();
		} else if (super.getSize() == SIZE.LARGE){
			price += 2 * super.getSizePrice();
		}
		  
		if (theWeekend) {
			price += WEEKEND_FEE;
		}
		  
		return price;
	}
	
}
