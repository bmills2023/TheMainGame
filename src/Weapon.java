
public class Weapon extends Item{
//private int attack;
private final String UNIQUE_IDENTIFIER="WEAPON";
public Weapon() {
	super("Sword");
	super.setBuff(0);
}
public Weapon(String newName,int newAttack) {
	super(newName);
	super.setBuff(newAttack);
}
// getters and setters for Weapon
public String getWeaponName() {
	return super.getName();
}
public void setWeaponName(String newName) {
	 super.setName(newName);
}
public int getWeaponAttack() {
	return super.getBuff();
}
public void setWeaponAttack(int num) {
	super.setBuff(num); 
}

public String getUI() {
	return UNIQUE_IDENTIFIER;
}
}