import java.awt.*;
import javax.swing.JComponent;
public class Grid extends JComponent{
	public Grid() {
		repaint();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		drawLines(g);
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
	
}
