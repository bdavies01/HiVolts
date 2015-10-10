import java.awt.Graphics;
import javax.swing.JComponent;

public class Grid extends JComponent{
	private Tile[][] grid = new Tile[12][12];
	private Mho[] mhos = new Mho[12];
	private Fence[] fences = new Fence[64];
	private static final long serialVersionUID = 1L;
	public Grid() {
		init();
	}
	public void paint(Graphics g) {
		drawGrid(g);
	}
	public void drawGrid(Graphics g) {
		for(int i = 0; i<13; i++) {
			g.drawLine(0, i * 64, 768, i * 64);
			g.drawLine(i*64, 0, i*64, 768);
		}
	}
	public void draw(Graphics g) {
		for (Fence f: fences) {
			f.draw(g, f.getX(), f.getY());
		}
	}
	public void init() {
		createFences();
		//createMhos();
	}
	public void createFences() {
		int wall_left = 44;
		for(int i=0; i<grid.length; i++){
			for(int j=0; j<grid[i].length; j++){
				if((i==0 || j==0)||(i==11 || j==11)){
					Fence f = new Fence(i,j);
					System.out.println("Success");
					grid[i][j] = f;
					wall_left -= 1;
					fences[wall_left+20] = f;
				}
			}
		}
		int fencesleft = 20;
		while(fencesleft >0) {
			fencesleft--;
		}
	}
	public void createMhos() {
		int mhosleft = 12;
		while(mhosleft >0) {
			mhosleft--;
		}
	}
}
