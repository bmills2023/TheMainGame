
public class HealthPotion extends Potion{
private final String UNIQUE_IDENTIFIER="HEALTH_POTION";	
public HealthPotion(String newName,int newBuff) {
	super(newName,newBuff);
	
}
public String getUI() {
	return UNIQUE_IDENTIFIER;
}
	
	

}
