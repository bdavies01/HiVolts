
abstract class Entity extends Tile{
	public Entity(int x, int y) {
		super(x, y);
	}
//	public void playermove(int x, int y) {
//		int origx = getX() / 64;
//		int origy = getY() / 64;
//		destroy();
//		Player newp = new Player((origx + x) * 64, (origx + y) * 64);
//		grid[origx + x][origy + y] = newp;
//	}
//	public void destroy() {
//		grid[this.getX() /64][this.getY() /64] = null;
//	}
//	public void mhomove(int x, int y) {
//		
//	}
}
