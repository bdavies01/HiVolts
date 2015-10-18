
abstract class Entity extends Tile{
	private boolean valid = true;
	public Entity(int x, int y) {
		super(x, y);
	}
	public void die() {
		setValid(false);
	}
	public boolean isValid(){
		return this.valid;
	}
	public void setValid(boolean valid){
		this.valid = valid;
	}
}
