import java.util.ArrayList;

public class Catalog {
	
	private ArrayList<Item> c;
	private String cN;
	
	public Catalog(String name) {
		cN = name;
	}
	public void add(Item item) {
		c.add(item);
	}
	public int size() {
		return c.size();
	}
	public String getName() {
		return cN;
	}
}
