import java.awt.*;
import javax.swing.JComponent;
public class Grid extends JComponent{
	private static final long serialVersionUID = 1L;
	Fence f = new Fence(50, 50);
	Unit[][] tiles = new Unit[12][12];
	public Grid() {
		repaint();
		setPreferredSize(new Dimension(600, 600));
	}
	public void drawPerimeter() {
		for(int i = 0; i<13; i++) {
			tiles[0][i] = new Fence(0, 600/i);
			tiles[12][i] = new Fence(600/i, 0);
			tiles[i][0] = new Fence(550, 600/i);
			tiles[i][12] = new Fence(600/i, 550);
		}
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		drawLines(g);
		for(int i = 0; i < 13; i++) {
			for(int j = 0; j < 13; j++) {
				tiles[i][j].getX()
			}
		}
	}
	public void drawLines(Graphics g) {
		for(int i = 0; i < 13; i ++) {
			g.drawLine(0, 0 + (i * (590/12)), 590, 0 + (i * (590/12)));
		} 
		for(int i = 0; i < 13; i ++) {
			g.drawLine(0 + (i * (590/12)), 0, 0 + (i * (590/12)), 590);
		}
	}
	/*public void drawFences(Graphics g) {
		g.setColor(Color.RED);
		for(int i = 0; i < 12; i++) {
			g.fillRect(i * (590/12) + 10, 10, 30, 30);
			g.fillRect(10, i * (590/12) + 10, 30, 30);
			g.fillRect(i * (590/12) + 10, 11 * (590 / 12) + 10, 30, 30);
			g.fillRect(11 * (590 / 12) + 10, i * (590/12) + 10, 30, 30);
		}
	} */
	
}
