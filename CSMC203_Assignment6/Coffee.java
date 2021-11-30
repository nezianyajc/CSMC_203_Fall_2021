
public class Coffee extends Beverage {
	boolean extraShot, extraSyrup;
	
	private final double SHOT_COST = .50;
	private final double SYRUP_COST = .50;

	
	public Coffee(String name, SIZE size, boolean shot, boolean syrup ) {
		super(name, TYPE.COFFEE,size);
		this.extraShot = shot;
		this.extraSyrup = syrup;	
	}
	
	public double calcPrice() {
		double cost = super.getBasePrice();
		if(extraShot) {
			cost += SHOT_COST;
		}
		
		if(extraSyrup) {
			cost += SYRUP_COST;
		}
		
		if(super.getSize() == SIZE.MEDIUM) {
			cost += super.getSizePrice();
		} else if(super.getSize() == SIZE.LARGE) {
			cost += 2 * super.getSizePrice();
		}	
		
		return cost;
	}
	

	public boolean equals(Coffee coffee){
		if(super.equals(coffee) && extraSyrup == coffee.getExtraSyrup() &&  extraShot == coffee.getExtraShot()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	
	public double getSyrupCost() {
		return SYRUP_COST;
	}
	
	public boolean getExtraShot() {
		return extraShot;
	}
	
	public double getShotCost() {
		return SHOT_COST;
	}
	
	public void setExtraShot(boolean shot) {
		this.extraShot = shot;
	}
	
	public void setExtraSyrup(boolean syrup) {
		this.extraSyrup = syrup;
	}
	
	
	
	public String toString() {
		String str = getBevName() + "," + getSize();
		
		if(extraShot) {
			str = str + "Got an extra shot";
		}
		
		if(extraSyrup) {
			str = str + "Got an extra syrup";
		}
		
		str += " $" + calcPrice();
		
		return str;
	}
	
}
