import java.awt.BorderLayout;
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
		setSize(605, 624);
		setTitle("Hivolts");
	}
}