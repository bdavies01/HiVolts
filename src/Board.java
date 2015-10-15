import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Board extends JFrame{
	private static final long serialVersionUID = 1L;
	public Board(Keyboard k) {
		Grid g = new Grid(k);
		this.add(g, BorderLayout.CENTER);
		setSize(785, 807);
		setBackground(Color.GRAY);
		setTitle("Hivolts");
		//setResizable(false);
	}
	
}
