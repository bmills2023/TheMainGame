
public class Item implements Thing{
private final String UNIQUE_IDENTIFIER="ITEM";	
private String name;
private int buff;
public Item() {
	name="";
	buff=0;
}


public Item(String newName) {
name=newName;
buff=0;
}
public Item(String newName,int newBuff) {
	name=newName;
	buff=newBuff;
}
public void setName(String newName) { 
	name=newName;
}
public String getName() {
	return name;
}
public int getBuff() {
	return buff;
}
public void setBuff(int num) {
	buff=num;
}
public String getUI() {
	return UNIQUE_IDENTIFIER;
}
	
//abstract void buff();
}
