// CSMC203 Assignment-6 11-29-21

public class Smoothie extends Beverage {
    private int numOfFruit;
    private boolean proteinPowder = true;
    private final double FRUIT_COST = .5;
    private final double PROTEIN_COST = 1.5;
    
    
    public Smoothie(String name, SIZE size, int fruitNum, boolean proteinP) {
    	super(name, TYPE.SMOOTHIE, size);
    	this.numOfFruit = fruitNum;
    	this.proteinPowder = proteinP;
    }
    
    public int getNumOfFruits() {
    	return numOfFruit;
    }
    
    public boolean getAddProtien() {
    	return proteinPowder;
    }
    
    public double getFruitCost() {
    	return FRUIT_COST;
    }
    
    public double getProteinCost() {
    	return PROTEIN_COST;
    }
    
    public void setNumOfFruits(int fruitNum) {
    	this.numOfFruit = fruitNum;
    }
    
    public void setProteinPowder(boolean proteinP) {
    	this.proteinPowder = proteinP;
    }
   
    
    
    public double calcPrice() {
    	double cost = super.getBasePrice();
    	
    	cost += numOfFruit * FRUIT_COST;
    	if (proteinPowder) {
    		cost += PROTEIN_COST;
    	}
    	  
    	if (super.getSize() == SIZE.MEDIUM) {
    		cost += super.getSizePrice();
    	}
    	else if (super.getSize() == SIZE.LARGE) {
    		cost += 2 * super.getSizePrice();
    	}
    	  
    	return cost;
    }
    
    public String toString() {
    	String str = getBevName() +", " +getSize() +" " +numOfFruit +" Fruits";
    	  
    	if (proteinPowder) {
    		str += " Added protein powder";
    	}
    	  
    	str += " $" +calcPrice();
    	  
    	return str;
    }
    
    public boolean equals(Smoothie smoothie) {
    	if (super.equals(smoothie) && proteinPowder ==smoothie.getAddProtien() && numOfFruit ==smoothie.getNumOfFruits()) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
