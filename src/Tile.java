
public class Tile {
	private int x, y, width, height;
	public Tile(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public Tile(int x, int y) {
		this(x, y, 64, 64);
	}
	/**
	 * setters and getters for the x coordinates, y coordinates,
	 * height, and with of the tile. 
	 */
	public int getX() { //x coordinate getter
		return(x);
	}
	public int getY() { //y coordinate getter
		return(y);
	}
	public int getWidth() { //width getter
		return(width);
	}
	public int getHeight() { //height getter
		return(height);
	}
	public void changeX(int x) { //setter for the x coordinate
		this.setX(x);
	}
	public void changeY(int y) { //setter for the y coordinate
		this.setY(y);
	}
	public void setX(int x) { //setter for x coordinate
		this.x = x;
	}
	public void setY(int y) { //getter for the y coordinate
		this.y = y;
	}
}
