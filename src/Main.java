import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Keyboard k = new Keyboard();
		Board b = new Board(k);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setVisible(true);
	}

}
