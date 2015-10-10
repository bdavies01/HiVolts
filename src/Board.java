import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Board extends JFrame{
	private static final long serialVersionUID = 1L;

	public Board() {
		Grid g = new Grid();
		this.add(g, BorderLayout.CENTER);
		setSize(785, 807);
		setBackground(Color.GRAY);
	}
}
