
abstract class Entity extends Tile{
	private boolean valid = true;
	public Entity(int x, int y) {
		super(x, y);
	}
	public void die() {
		setValid(false);
	}
	/**
	 * These three methods control whether
	 * or not the entity will actually
	 * be displayed on the gameboard. 
	 * If isvalid is false, they will not
	 * be displayed. 
	 * @return if valid
	 */
	public boolean isValid(){
		return this.valid;
	}
	public void setValid(boolean valid){
		this.valid = valid;
	}
}
