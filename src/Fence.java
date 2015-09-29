import java.awt.*;
public class Fence extends Unit{
	public Fence(int x, int y, Color color) {
		xcoord = x;
		ycoord = y;
		c = color;
		type = 1;
	}
	public void paint(Graphics g) {
		drawFence(g);
	}
	public void drawFence(Graphics g) {
		g.setColor(c);
	}
}
