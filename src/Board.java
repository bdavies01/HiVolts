import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Board extends JFrame implements KeyListener{
	private static final long serialVersionUID = 1L;
	public String action;
	public int changex;
	public int changey;
	public Board() {
		Grid g = new Grid();
		this.add(g, BorderLayout.CENTER);
		setSize(785, 807);
		setBackground(Color.GRAY);
		setTitle("Hivolts");
		addKeyListener(this);
		//setResizable(false);
	}
	public String getAction() {
		return(action);
	}
	
	public int getChangeX() {
		return(changex);
	}
	
	public int getChangeY() {
		return(changey);
	}
	
	public void resetX() {
		changex = 0;
	}
	
	public void resetY() {
		changey = 0;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();
		switch(key) {
		case 'w': 
			action = "up";
			changex = 0;
			changey = 1;
			break;
		case 'a':
			action = "left";
			changex = -1;
			changey = 0;
			break;
		case 's':
			action = "sit";
			changex = 0;
			changey = 0;
			break;
		case 'd': 
			action = "right";
			changex = 1;
			changey = 0;
			break;
		case 'z':
			action = "down left";
			changex = -1;
			changey = -1;
			break;
		case 'x':
			action = "down";
			changex = 0;
			changey = -1;
			break;
		case 'c': 
			action = "down right";
			changex = 1;
			changey = -1;
			break;
		case 'j': 
			action = "jump";
			break;
		default: 
			System.out.println("Rekt.");
			break;
		}
	}
//	public void playerMove(String action) {
//		switch(action) {
//		case "up": 
//		}
//	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
