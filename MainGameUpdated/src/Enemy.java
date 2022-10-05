
public class Enemy {
	private int health;
	private String name;
	private int attack;
	
	
public 	Enemy() {
	health = 69;
	name = "Bob";
	attack=0;
	
}
public Enemy(String newName,int newAttack,int newHealth) {
	name=newName;
	attack=newAttack;
	health=newHealth;
	
	
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
public int getAttack() {
	return attack;
}
public String getName() {
	return name;
}
public String toString() {
	return name+"'s Health: "+health+"\n"+name+"'s Attack: "+attack;
}
public void addAttack(int num) {
	attack=attack+num;
}
}


