import javax.swing.JFrame;

public class Main {
	
	/**
	 * Main method that initializes the gameboard, sets the closing operation, 
	 * and sets the board to be visible. 
	 * @param args
	 */
	public static void main(String[] args) {
		Board b = new Board();
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setVisible(true);
	}

}
