import java.awt.*;
public class Fence extends Unit{
	public Fence(int x, int y) {
		super (x,y);
	}
	public void paint(Graphics g) {
		g.setColor(Color.YELLOW);
		drawFence(g);
	}
	public void drawFence(Graphics g) {
		g.fillRect(0, 0, 50, 50); 
	}
}
