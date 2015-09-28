import java.awt.Color;
import java.awt.Graphics;

public abstract class Unit {
	protected int xcoord, ycoord;
	protected Color c;
	public void setX(int x) {
		xcoord = x;
	}
	public void setY(int y) {
		ycoord = y;
	}
	public int getX(){
		return xcoord;
	}
	public int getY() {
		return ycoord;
	}
	public void paint(Graphics g){
		
	}
}