import java.awt.Color;
import java.awt.Graphics;

public class Mho extends Entity{
	public Mho(int x, int y) {
		super(x, y);
	}
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.RED);
		g.fillOval(x+7, y+7, 50, 50);
	}
}
