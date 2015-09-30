import java.awt.*;
import javax.swing.JComponent;
public class Grid extends JComponent{
	private static final long serialVersionUID = 1L;
	//Unit[][] tiles = new Unit[12][12];
	Unit[][] tiles = new Unit[12][12];
	public Grid() {
		repaint();
		setPreferredSize(new Dimension(600, 600));
	}
	public void drawPerimeter() {
		for(int i = 0; i<13; i++) {
			if(i ==0) {
				tiles[0][i] = new Fence(0, 600/(i+1), Color.RED);
				tiles[11][i] = new Fence(600/(i+1), 0, Color.RED);
				tiles[i][0] = new Fence(550, 600/(i+1), Color.RED);
				tiles[i][11] = new Fence(600/(i+1), 550, Color.RED);
			} else if(i ==12) {
				tiles[0][i-1] = new Fence(0, 600/(i), Color.RED);
				tiles[11][i-1] = new Fence(600/(i), 0, Color.RED);
				tiles[i-1][0] = new Fence(550, 600/(i), Color.RED);
				tiles[i-1][11] = new Fence(600/(i), 550, Color.RED);
			}
			else {
				tiles[0][i] = new Fence(0, 600/i, Color.RED);
				tiles[11][i] = new Fence(600/i, 0, Color.RED);
				tiles[i][0] = new Fence(550, 600/i, Color.RED);
				tiles[i][11] = new Fence(600/i, 550, Color.RED);
			}
		}
	}
	public void Draw(Graphics g){
		for(Unit[] i: tiles){
			for(Unit j: i){
				if(j!=null){
					j.drawRects(g);
				}
			}
		}
		
	}
	 public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		drawLines(g);
		drawPerimeter();
		Draw(g);
		/*try{
			for(int i = 0; i < 13; i++) {
				for(int j = 0; j < 13; j++) {
					tiles[i][j].setType(1);
					tiles[i][j].paint(g);
				}
			} 
		} catch(NullPointerException e) {
			
		} */
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
