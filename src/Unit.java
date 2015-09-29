import java.awt.Color;
import java.awt.Graphics;

public abstract class Unit {
	protected int xcoord, ycoord;
	protected int type = 0;
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
	public void setType(int t) {
		type = t;
	}
	public int getType() {
		return(type);
	}
	public void paint(Graphics g){
		if(getType() == 0) {
			
		} else if(getType() == 1) {
			
		}
	}
}