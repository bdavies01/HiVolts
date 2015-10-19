import java.awt.Color;
import java.awt.Graphics;

public class Player extends Entity{
	/**
	 * Constructor that refers to the x and y constructor of tile.
	 * @param x
	 * @param y
	 */
	public Player(int x, int y) {
		super(x, y);
	}
	/**
	 * Draws the player as a blue square
	 * @param g
	 * @param x
	 * @param y
	 */
	public void draw(Graphics g, int x, int y) {
		if(this.isValid()){
			g.setColor(Color.BLUE);
			g.fillRect(x + 10, y + 10, 46, 46);
		}
	}
}