
public class Special_Item extends Item {
	private final String UI="SPECIAL_ITEM";
	public Special_Item() {
		super("Special");
		super.setBuff(1);

	}
	public Special_Item(String name,int buff) {
		super(name);
		super.setBuff(buff);
	}
	
	public void special() {
		
	}
	public String getUI() {
		return UI;
	}
}
