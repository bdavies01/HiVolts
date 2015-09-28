import java.awt.*;
public class Fence extends Unit{
	public Fence(int x, int y) {
		xcoord = x;
		ycoord = y;
		c = Color.YELLOW;
	}
	public void paint(Graphics g) {
		drawFence(g);
	}
	public void drawFence(Graphics g) {
		g.setColor(c);
		g.fillRect(xcoord, ycoord, 50, 50); 
	}
}
