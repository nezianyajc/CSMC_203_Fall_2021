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
	
	public Television(String brand, int size) {
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
	}
	
	
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
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}

}
