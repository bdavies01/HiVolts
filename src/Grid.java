import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.lang.Math;

public class Grid extends JComponent{
	public Mho[] mhos = new Mho[12];
	public enum gameState { //gamestate controls what happens during the game and when to end the game
		PLAYING, WON, LOST
	}
	gameState state;
	public Tile[][] grid = new Tile[12][12];
	private Fence[] fences = new Fence[44];
	private Fence[] rfences = new Fence[20];
	private Player p;
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor
	 */
	public Grid() {
		repaint();
		init();
	}
	/**
	 * Paint method which calls the drawGrid and draw functions to perform their 
	 * respective tasks. Also draws a gray rectangle to act as the background. 
	 */
	public void paint(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, getWidth(), getHeight());
		drawGrid(g);
		draw(g);
	}
	/**
	 * @param g
	 * Uses Graphics to draw lines from a for loop, creating
	 * the 12 by 12 grid. 
	 */
	public void drawGrid(Graphics g) {
		g.setColor(Color.BLACK);
		for(int i = 0; i<13; i++) { //executes 12 times
			g.drawLine(0, i * 64, 768, i * 64);
			g.drawLine(i*64, 0, i*64, 768);
		}
	}
	/**
	 * @param g
	 * Draws all of the aspects of the game. Uses for loops to traverse the Fence, 
	 * random fence, and mho arrays and then calls their draw method. Calls the
	 * draw method of the player p as well. 
	 */
	public void draw(Graphics g) {
		for (Fence f: fences) { //traversing fences array
			f.draw(g, f.getX() * 64, f.getY() * 64);
		}
		for(Fence f: rfences) { //traversing random fences array
			f.draw(g, f.getX() * 64, f.getY() * 64);
		}
		for(Mho m: mhos) { //traversing mhos array
			m.draw(g, m.getX() * 64, m.getY() * 64); 
		}
		p.draw(g, p.getX() * 64, p.getY() * 64);
	}
	/**
	 * Called from the Grid constructor. This method calls the other methods to
	 * load the Fences, Mhos, and the Player. It also sets the gamestate to 
	 * PLAYING. 
	 */
	public void init() {
		state = state.PLAYING;
		createFences(); //create and draw fences
		createMhos(); //create and draw mhos
		createPlayer(); //create and draw the player
	}
	/**
	 * This function creates both the fences on the outside perimeter
	 * and also the randomly generated ones on the inside. For the ones 
	 * on the outside, a nested for loop is used to create fences only if 
	 * either their x or y coordinates is zero. For the random ones, random
	 * numbers are created then applied in the grid[][] array. 
	 */
	public void createFences() {
		int wall_left = 44;
		for(int i=0; i<grid.length; i++){ //executes 12 times
			for(int j=0; j<grid[i].length; j++){ //executes 12 times for 144 total times
				if((i==0 || j==0)||(i==11 || j==11)){
					Fence f = new Fence(i,j);
					grid[i][j] = f;
					wall_left -= 1;
					fences[wall_left] = f;
				}
			}
		}
		int fencesleft = 20;
		int randomx;
		int randomy;
		while(fencesleft >0) {
			randomx = (int) (Math.random() * 12);
			randomy = (int) (Math.random() * 12);
			if((grid[randomx][randomy] == null) && fencesleft > 0) {
				Fence f = new Fence(randomx, randomy);
				grid[randomx][randomy] = f;
				fencesleft--;
				rfences[fencesleft] = f;
			}
		}
	}
	/**
	 * Creates the mhos with their random coordinates and stores them both
	 * in an array called mhos and in the master grid array. Uses a while loop
	 * to count down from 12 to create 12 mhos. 
	 */
	public void createMhos() {
		int mhosleft = 12;
		int randomx;
		int randomy;
		while(mhosleft >0) { //counting down from 12
			randomx = (int) (Math.random() * 12);
			randomy = (int) (Math.random() * 12);
			if((grid[randomx][randomy] == null) && mhosleft > 0) {
				Mho m = new Mho(randomx, randomy);
				grid[randomx][randomy] = m; //storing in grid[][]
				mhosleft--;
				mhos[mhosleft] = m; //storing in mhos[]
			}
		}
	}
	/**
	 * Creates the player with random coordinates and 
	 * initializes it in the grid array.
	 */
	public void createPlayer() {
		int randomx;
		int randomy;
		int playersleft = 1;
		while(playersleft >0) { //using a counter to count down
			randomx = (int) (Math.random() * 12); //random points
			randomy = (int) (Math.random() * 12);
			if((grid[randomx][randomy] == null)) {
				p = new Player(randomx, randomy);
				grid[randomx][randomy] = p;
				playersleft--;
			}
		}
	}
	/**
	 * 
	 * @param new x position
	 * @param new y position
	 * This function moves the player to the new specified x and y coordinates
	 * on the grid array. If there are instances of either a Fence or an Mho on
	 * the destination, the gamestate is changed to lost. Otherwise, the game
	 * keeps running and the mhos move. 
	 */
	public void moveplayer(int x, int y){
		int oldx = p.getX();
		int oldy = p.getX();
		int newx = (p.getX()) + x;
		int newy = (p.getY()) + y;
		if((grid[newx][newy] instanceof Fence) || (grid[newx][newy] instanceof Mho)) {
			grid[oldx][oldy] = null;
			p.setValid(false);
			state = state.LOST;
		} else {
			grid[oldx][oldy] = null;
			grid[newx][newy] = p;
			p.changeX(newx);
			p.changeY(newy);
		}
	}
	/**
	 * This is the jump method for the player. A random number is generated
	 * between 0 and 12 and its tested in the grid array to see if there is an 
	 * instatnce of Fence there. If so, it is called until the player is 
	 * guaranteed to not land on a Fence. If the player lands on a Mho, the 
	 * gamestate is changed to lose. If none of these happen, the player can 
	 * successfully land on a square and keep playing the game as their turn. 
	 */
	public void jump() {
		int oldx = p.getX();
		int oldy = p.getX();
		int newx = (int)(Math.random() * 12);
		int newy = (int)(Math.random() * 12);
		if(grid[newx][newy] instanceof Fence) {
			jump();
		} else if(grid[newx][newy] instanceof Mho) {
			grid[oldx][oldy] = null;
			p.setValid(false);
			state = state.LOST;
		}
		else {
			grid[oldx][oldy] = null;
			grid[newx][newy] = p;
			p.changeX(newx);
			p.changeY(newy);
		}
	}
	/**
	 * mho move logic
	 */
	public void CalcMove(Mho m) {
		if(m.getX() == p.getX()) {
			Vertical(m);
		} else if(m.getY() == p.getY()) {
			Horizontal(m);
		} else {
			Vertical(m);
			Horizontal(m);
		}
	}
	/**
	 * Horizontal mho movement. Checks if there is an instance of
	 * either a Fence of the Player and removes or causes the gamestate
	 * to be losing, respectively. 
	 * @param m
	 */
	public void Horizontal(Mho m) {
		int dx = p.getX() - m.getX();
		if(dx >0) {
			if(grid[m.getX()+1][m.getY()] instanceof Fence) {
				m.setValid(false);
				grid[m.getX()][m.getY()] = null;
				grid[m.getX() + 1][m.getY()] = null;
			} else if (grid[m.getX()+1][m.getY()] instanceof Player) {
				state = state.LOST;
			} else {
				grid[m.getX() + 1][m.getY()] = m;
				grid[m.getX()][m.getY()] = null;
				m.changeX(m.getX() + 1);
			}
		} else {
			m.changeX(m.getX() - 1);
		}
	}
	/**
	 * Vertical mho movement. Checks if there is an instance of either 
	 * a Fence or the Player and removes or causes the gamestate to be
	 * losing, respectively. 
	 * @param m
	 */
	public void Vertical(Mho m) {
		int dy = p.getY() - m.getY();
		if(dy >0) {
			//using instanceof to check for Fences
			if(grid[m.getX()][m.getY()+1] instanceof Fence) {
				m.setValid(false);
				grid[m.getX()][m.getY()] = null;
				grid[m.getX()][m.getY() + 1] = null;
			} else if (grid[m.getX()][m.getY()+1] instanceof Player) {
				state = state.LOST;
			} else {
				grid[m.getX()][m.getY() + 1] = m;
				grid[m.getX()][m.getY()] = null;
				m.changeY(m.getY() + 1);
			}
		} else {
			m.changeY(m.getY() - 1); 
		}
	}
	/**
	 * Called from the board class. Calls the other
	 * mho movement classes if the 
	 */
	public void movemho() {
		int counter = 0;
		for(int i = 0; i < mhos.length; i++) {
			if(mhos[i] != null) {
				CalcMove(mhos[i]);
			}
		}
		for(int i = 0; i < mhos.length; i++) {
			if(!(mhos[i] == null)) {
				counter ++;
			}
		}
		if(counter ==0) {
			state = state.WON;
		}
	}
}
