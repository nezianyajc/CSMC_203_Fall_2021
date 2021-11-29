/**  

*The purpose of this class is to model a television 

*Joshua Nezianya 11/22/21

*/ 
public class Television {
	
	final private String MANUFACTURER;
	final private int SCREEN_SIZE;
	private boolean powerOn = false;
	private int channel = 2;
	private int volume = 20;
	
	// @param string for brand int for screen size
	public Television(String brand, int size) {
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
	}
	
	//@param int for channel
	public void setChannel(int chan) {
		this.channel =  chan;
	}
	
	public void power() {
		if(powerOn) {
			powerOn = false;
		} else if(!powerOn) {
			powerOn  = true;
					 
		}
	}
	
	public void increaseVolume() {
		if(volume != 100) {
		volume = volume + 1;
		}
	}
	
	public void decreaseVolume() {
		if(volume != 0) {
			volume = volume - 1;
		}
	}
	
	//@return integer 
	public int getChannel() {
		return channel;
	}
	//@return integer
	public int getVolume() {
		return volume;
	}
	
	//@return String
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	//@return integer
	public int getScreenSize() {
		return SCREEN_SIZE;
	}

}
