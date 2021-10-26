
public class Plot {
	private int x, y, width, depth;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public boolean overlaps(Plot plot) {
		if( x < plot.x + plot.width && x + width > 
			plot.x && y < plot.y + plot.depth && y + depth > plot.y) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean encompasses(Plot plot) {
		if(plot.y >= y && plot.y <= (y+depth)
			&& plot.x >= x && plot.x <= (x+width)
			&& (plot.x + plot.width)>=x &&(plot.x + plot.width)
			<= (x+width)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}
	
	public String toString() {
		String str = "Upper left: (" + getX() + "," + getY() + "); Width: " + getWidth() + " Depth: " + getDepth();

		return str;
	}
	
	
}
