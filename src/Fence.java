import java.awt.Color;
import java.awt.Graphics;

public class Fence extends Tile{
	public Fence(int x, int y) {
		super(x, y);
	}
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.YELLOW);
		g.fillRect(x+7, y+7, 10, 50);
		g.fillRect(x + 57, y+47, 10, 50);
	}
}
