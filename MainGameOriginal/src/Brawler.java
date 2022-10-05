
public class Brawler extends Character{
public Brawler(String name) {
	super(name);
	super.setHealth(20);
	super.setAttack(10);//in order to calculate total player damage, character attack is added to weapon attack. Its kinda like a multipler but without the multiplying for less complicated math
	super.setSpeed(3);
}


	
	
	public void specialMove() {
	
}
}
