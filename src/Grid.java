import java.awt.*;
import javax.swing.JComponent;
public class Grid extends JComponent{
	private static final long serialVersionUID = 1L;
	Fence f = new Fence(50, 50);
	public Grid() {
		repaint();
		setPreferredSize(new Dimension(600, 600));
	}
	/*public void resize() {
		if(getWidth() != getHeight()) {
			
		}
	} */
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		drawLines(g);
		drawFences(g);
		f.drawFence(g);
	}
	public void drawLines(Graphics g) {
		drawVerticalLines(g);
		drawHorizontalLines(g);
	}
	public void drawVerticalLines(Graphics g) {
		for(int i = 0; i < 13; i ++) {
			g.drawLine(0, 0 + (i * (getHeight()/12)), getHeight(), 0 + (i * (getHeight()/12)));
		} 
	}
	public void drawHorizontalLines(Graphics g) {
		for(int i = 0; i < 13; i ++) {
			g.drawLine(0 + (i * (getHeight()/12)), 0, 0 + (i * (getHeight()/12)), getHeight());
		}
	}
	public void drawFences(Graphics g) {
		g.setColor(Color.RED);
		for(int i = 0; i < 12; i++) {
			g.fillRect(i * (getHeight()/12) + 10, 10, 30, 30);
			g.fillRect(10, i * (getHeight()/12) + 10, 30, 30);
			g.fillRect(i * (getHeight()/12) + 10, 11 * (getHeight() / 12) + 10, 30, 30);
			g.fillRect(11 * (getHeight() / 12) + 10, i * (getHeight()/12) + 10, 30, 30);
		}
	}
	
}
