import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
public class Board extends JFrame{
	public Board() {
		Grid g = new Grid();
		setLayout(new BorderLayout());
		add(g, BorderLayout.CENTER);
		g.setSize(500,500);
	}
}