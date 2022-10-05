
public class Character {
	private int health;
	private String name;
	private int attack;
	private int speed;
	private Weapon playerWeapon;
	private Armor playerArmor;
	private int deathCounter;
	
	
public Character() {
	name = "Toby";
	
	
}
public Character(String newName) {
	Weapon weaponStarter=new Weapon("No Weapon",0);
	Armor armorStarter=new Armor("No Armor",0);
	name=newName;
	playerArmor=armorStarter;
	playerWeapon=weaponStarter;
	speed=0;
	deathCounter=0;
	
	
}
public int getHealth() {
	return health;
}
public void addHealth(int num) {
	health=health+num;
}
public void removeHealth(int num) {
	health=health-num;
	
}
//abstract void specialMove();
public void setHealth(int num) {
	health=num;
}
public void setAttack(int num) {
	attack=num;
}
public String getName() {
	return name;
}
public void setName(String user_name) {
	name = user_name;
}
public int getAttack() {
	return attack;
}
public String toString() {
	return name+"'s Health: "+health+"\n"+name+"'s Attack: "+attack;
}
public void addAttack(int num) {
	attack=attack+num;
}
public void setPlayerArmor(Armor newArmor) {
	playerArmor=newArmor;
}
public void setPlayerWeapon(Weapon newWeapon) {
	playerWeapon=newWeapon;
}
public Weapon getPlayerWeapon() {
	return playerWeapon;
}
public Armor getPlayerArmor() {
	return playerArmor;
}
public void setSpeed(int newSpeed) {
	speed=newSpeed;
}
public int getSpeed() {
	return speed;
}
public void addDeath(int num) {
	deathCounter=deathCounter+num;
}
public int getDeath() {
	return deathCounter;
}
}
