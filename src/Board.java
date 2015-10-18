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
			if(g.state == g.state.PLAYING) {
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
				g.movemho();
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
	public void win() {
		this.dispose();
		Win w = new Win();
	}
	public void lose() {
		this.dispose();
		Lose l = new Lose();
	}
}
