import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener{
	String action;
	int changex;
	int changey;
	public Keyboard() {
		
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
			changex = 0;
			changey = 1;
			System.out.println(key);
			break;
		case 'a':
			changex = -1;
			changey = 0;
			break;
		case 's':
			changex = 0;
			changey = 0;
			break;
		case 'd': 
			changex = 1;
			changey = 0;
			break;
		case 'z':
			changex = -1;
			changey = -1;
			break;
		case 'x':
			changex = 0;
			changey = -1;
			break;
		case 'c': 
			changex = 1;
			changey = -1;
			break;
		case 'j': 
			
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
