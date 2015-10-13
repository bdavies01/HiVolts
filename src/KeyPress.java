import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPress implements KeyListener{
	public String action;
	int changex = 0;
	int changey = 0;
	public KeyPress() {
		
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
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
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
			System.out.println(key);
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

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
