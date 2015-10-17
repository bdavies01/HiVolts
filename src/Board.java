import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Board extends JFrame implements KeyListener{
	private static final long serialVersionUID = 1L;
	private int changex, changey;
	private Grid g = new Grid();
	public Board() {
		addKeyListener(this);
		this.add(g, BorderLayout.CENTER);
		setSize(785, 807);
		setBackground(Color.GRAY);
		setTitle("Hivolts");
		g.update();
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
			changex = 0;
			changey = -1;
			g.moveplayer(changex, changey);
			g.movemho();
			break;
		case 'a':
			changex = -1;
			changey = 0;
			g.moveplayer(changex, changey);
			g.movemho();
			break;
		case 's':
			changex = 0;
			changey = 0;
			g.moveplayer(changex, changey);
			g.movemho();
			break;
		case 'd': 
			changex = 1;
			changey = 0;
			g.moveplayer(changex, changey);
			g.movemho();
			break;
		case 'z':
			changex = -1;
			changey = 1;
			g.moveplayer(changex, changey);
			g.movemho();
			break;
		case 'x':
			changex = 0;
			changey = 1;
			g.moveplayer(changex, changey);
			g.movemho();
			break;
		case 'c': 
			changex = 1;
			changey = 1;
			g.moveplayer(changex, changey);
			g.movemho();
			break;
		case 'e':
			changex = 1;
			changey = -1;
			g.moveplayer(changex, changey);
			g.movemho();
			break;
		case 'q': 
			changex = -1;
			changey = -1;
			g.moveplayer(changex, changey);
			g.movemho();
			break;
		case 'j': 
			g.jump();
			g.movemho();
			break;
		default: 
			System.out.println("Rekt.");
			break;
		}
		g.repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
