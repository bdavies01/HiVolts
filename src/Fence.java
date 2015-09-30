import java.awt.*;
public class Fence extends Unit{
	public Fence(int x, int y, Color color) {
		xcoord = x;
		ycoord = y;
		c = color;
	}
	public void drawRects(Graphics g) {
		g.setColor(c);
		super.drawRects(g);
	}
}
