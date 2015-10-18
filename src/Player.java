import java.awt.Color;
import java.awt.Graphics;

public class Player extends Entity{
	public Player(int x, int y) {
		super(x, y);
	}
	public void draw(Graphics g, int x, int y) {
		if(this.isValid()){
			g.setColor(Color.BLUE);
			g.fillRect(x + 10, y + 10, 46, 46);
		}
	}
	public void kill(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(this.getX(), this.getY(), 46, 46);
	}
}

