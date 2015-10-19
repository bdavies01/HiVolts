import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Board extends JFrame implements KeyListener{
	private static final long serialVersionUID = 1L;
	private int changex, changey;
	private Grid g = new Grid(); //creates a new grid
	public Board() {
		addKeyListener(this); //adds keylistener
		this.add(g, BorderLayout.CENTER); //setting layout and dimensions
		setSize(785, 807);
		setBackground(Color.GRAY);
		setTitle("Hivolts");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	/**
	 * Keylistener listening for the keys pressed
	 * They call functions in the grid class based
	 * on which key is pressed. It only allows the game to run
	 * if it is in the playing state. Otherwise, it closes the game window
	 * and prints either won or lost to the console. 
	 */
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();
		switch(key) {
		case 'w':
			if(g.state == g.state.PLAYING) {
				//sets the changes in x and y on the gameboard. 
				changex = 0;
				changey = -1;
				g.moveplayer(changex, changey);
				g.movemho();
			}
			break;
		case 'a':
			if(g.state == g.state.PLAYING) {
				changex = -1;
				changey = 0;
				g.moveplayer(changex, changey);
				g.movemho();
			}
			break;
		case 's':
			if(g.state == g.state.PLAYING) {
				changex = 0;
				changey = 0;
				g.moveplayer(changex, changey);
				g.movemho();
			}
			break;
		case 'd': 
			if(g.state == g.state.PLAYING) {
				changex = 1;
				changey = 0;
				g.moveplayer(changex, changey);
				g.movemho();
			}
			break;
		case 'z':
			if(g.state == g.state.PLAYING) {
				changex = -1;
				changey = 1;
				g.moveplayer(changex, changey);
				g.movemho();
			}
			break;
		case 'x':
			if(g.state == g.state.PLAYING) {
				changex = 0;
				changey = 1;
				g.moveplayer(changex, changey);
				g.movemho();
			}
			break;
		case 'c': 
			if(g.state == g.state.PLAYING) {
				changex = 1;
				changey = 1;
				g.moveplayer(changex, changey);
				g.movemho();
			}
			break;
		case 'e':
			if(g.state == g.state.PLAYING) {
				changex = 1;
				changey = -1;
				g.moveplayer(changex, changey);
				g.movemho();
			}
			break;
		case 'q': 
			if(g.state == g.state.PLAYING) {
				changex = -1;
				changey = -1;
				g.moveplayer(changex, changey);
				g.movemho();
			}
			break;
		case 'j': 
			if(g.state == g.state.PLAYING) {
				g.jump();
				//does not call movemho because after a jump it is still Your turn.
			}
			break;
		default: 
			System.out.println("Rekt.");
			break;
		}
		if(g.state == g.state.WON) {
			win();
		} else if (g.state == g.state.LOST) {
			lose();
		}
		g.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Closes the game window and prints the win message to the console.
	 */
	public void win() {
		this.dispose();
		System.out.println("You win.");
	}
	/**
	 * Closes the game window and prints the lose message to the console.
	 */
	public void lose() {
		this.dispose();
		System.out.println("You lose.");
	}
}
