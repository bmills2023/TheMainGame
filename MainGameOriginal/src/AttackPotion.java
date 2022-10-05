
public class AttackPotion extends Potion{
private final String UNIQUE_IDENTIFIER="ATTACK_POTION";	
public AttackPotion(String newName,int newBuff) {
	super(newName,newBuff);
}
public String getUI() {
	return UNIQUE_IDENTIFIER;
}

	
}
