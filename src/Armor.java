
public class Armor extends Item{
//private int armorHealth;
private final String UNIQUE_IDENTIFIER="ARMOR";
public Armor() {
	super("Combat Armor");
	super.setBuff(0);
	
}
	
public Armor(String newName,int num) {
	super(newName);
	super.setBuff(num);
}
public int getArmorHealth() {
	return super.getBuff();
}
public String getUI() {
	return UNIQUE_IDENTIFIER;
}
	
}
