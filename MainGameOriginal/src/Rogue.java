
public class Rogue extends Character{
public Rogue(String name) {
	super(name);
	super.setHealth(30);
	super.setAttack(30);//in order to calculate total player damage, character attack is added to weapon attack. Its kinda like a multipler but without the multiplying for less complicated math
	super.setSpeed(5);
}
	
	
	
	public void specialMove() {
		
}
}
