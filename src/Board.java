import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
public class Board extends JFrame{
	public Board() {
		Grid grid = new Grid();
		setLayout(new BorderLayout());
		add(grid, BorderLayout.CENTER);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grid.setPreferredSize(new Dimension(598, 598));
		setSize(568, 590);
	}
	public void creation() {
		Fence f = new Fence(0, 0);
	}
}