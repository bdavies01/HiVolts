import java.awt.Color;
import java.awt.Graphics;

public class Box extends Unit{
	public Box(int x, int y, Color color) {
		
	}
	public void setType(int t) {
		type = t;
	}
	public int getType() {
		return(type);
	}
	public void paint(Graphics g) {
		if(getType() == 0) {
			
		} else if(getType() == 1) {
			g.fillRect(getX(), getY(), 50, 50); 
		} else if(getType() == 2) {
			
		} else if (getType() == 3) {
			
		}
	}
}