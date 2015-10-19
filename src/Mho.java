import java.awt.Color;
import java.awt.Graphics;

public class Mho extends Entity{
	public Mho(int x, int y) {
		super(x, y);
	}
	/**
	 * Draws the mhos as red squares based on the given x and
	 * y coordinates.
	 * @param g
	 * @param x
	 * @param y
	 */
	public void draw(Graphics g, int x, int y) {
		if(this.isValid()){
			g.setColor(Color.RED);
			g.fillOval(x+7, y+7, 50, 50);
		}
	}
}
