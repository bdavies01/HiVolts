
public class Tile {
	private int x, y, width, height;
	private Entity bad = null;
	public Tile(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public Tile(int x, int y) {
		this(x, y, 64, 64);
	}
	public int getX() {
		return(x);
	}
	public int getY() {
		return(y);
	}
	public int getWidth() {
		return(width);
	}
	public int getHeight() {
		return(height);
	}
	public void changeX(int x) {
		this.setX(x);
	}
	public void changeY(int y) {
		this.setY(y);
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setOccupant(Entity e) {
		bad = e;
	}
	public Entity getOccupant() {
		return(this.bad);
	}
}
