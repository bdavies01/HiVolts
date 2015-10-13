import java.awt.Color;
import java.awt.Graphics;

public class Fence extends Tile{
	public Fence(int x, int y) {
		super(x, y);
	}
	Color orange = new Color(255,165,0);
	public void draw(Graphics g, int x, int y) {
		g.setColor(orange);
		g.fillRect(x+7, y+7, 10, 50);
		g.fillRect(x + 47, y+7, 10, 50);
		g.fillRect(x+7, y+17, 40, 10);
		g.fillRect(x+7, y+37, 40, 10);
	}
}
