import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Board extends JFrame{
	private static final long serialVersionUID = 1L;
	private Tile[][] grid = new Tile[12][12];
	public Board(Keyboard k) {
		Grid g = new Grid(k);
		this.add(g, BorderLayout.CENTER);
		setSize(785, 807);
		setBackground(Color.GRAY);
		setTitle("Hivolts");
		g.update();
		setTile();
		//setResizable(false);
	}
	public void setTile() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				grid[i][j] = g.grid[i][j];
			}
		}
	}
}
