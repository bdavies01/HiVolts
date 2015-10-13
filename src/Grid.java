import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.lang.Math;

public class Grid extends JComponent{
	public Tile[][] grid = new Tile[12][12];
	private Mho[] mhos = new Mho[12];
	private Fence[] fences = new Fence[44];
	private Fence[] rfences = new Fence[20];
	private Player p;
	private static final long serialVersionUID = 1L;
	public Grid() {
		init();
		repaint();
	}
	public void paint(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, getWidth(), getHeight());
		drawGrid(g);
		draw(g);
	}
	public void drawGrid(Graphics g) {
		g.setColor(Color.BLACK);
		for(int i = 0; i<13; i++) {
			g.drawLine(0, i * 64, 768, i * 64);
			g.drawLine(i*64, 0, i*64, 768);
		}
	}
	public void draw(Graphics g) {
		for (Fence f: fences) {
			f.draw(g, f.getX() * 64, f.getY() * 64);
		}
		for(Fence f: rfences) {
			f.draw(g, f.getX() * 64, f.getY() * 64);
		}
		for(Mho m: mhos) {
			m.draw(g, m.getX() * 64, m.getY() * 64); 
		}
		p.draw(g, p.getX() * 64, p.getY() * 64);
	}
	public void init() {
		createFences();
		createMhos();
		createPlayer();
	}
	public void createFences() {
		int wall_left = 44;
		for(int i=0; i<grid.length; i++){
			for(int j=0; j<grid[i].length; j++){
				if((i==0 || j==0)||(i==11 || j==11)){
					Fence f = new Fence(i,j);
					grid[i][j] = f;
					wall_left -= 1;
					fences[wall_left] = f;
				}
			}
		}
		int fencesleft = 20;
		int randomx;
		int randomy;
		while(fencesleft >0) {
			randomx = (int) (Math.random() * 12);
			randomy = (int) (Math.random() * 12);
			if((grid[randomx][randomy] == null) && fencesleft > 0) {
				Fence f = new Fence(randomx, randomy);
				grid[randomx][randomy] = f;
				fencesleft--;
				rfences[fencesleft] = f;
			}
		}
	}
	public void createMhos() {
		int mhosleft = 12;
		int randomx;
		int randomy;
		while(mhosleft >0) {
			randomx = (int) (Math.random() * 12);
			randomy = (int) (Math.random() * 12);
			if((grid[randomx][randomy] == null) && mhosleft > 0) {
				Mho m = new Mho(randomx, randomy);
				grid[randomx][randomy] = m;
				mhosleft--;
				mhos[mhosleft] = m;
			}
		}
	}
	public void createPlayer() {
		int randomx;
		int randomy;
		int playersleft = 1;
		while(playersleft >0) {
			randomx = (int) (Math.random() * 12);
			randomy = (int) (Math.random() * 12);
			if((grid[randomx][randomy] == null)) {
				System.out.println("Success");
				p = new Player(randomx, randomy);
				grid[randomx][randomy] = p;
				playersleft--;
			}
		}
	}
}
