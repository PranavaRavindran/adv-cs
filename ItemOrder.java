
public class ItemOrder {
	
	private Item i;
	private int q;
	
	public ItemOrder(Item item, int qty) {
		i = item;
		q = qty;
	}
	public double getPrice() {
		return priceFor(q); 
	}
	public Item getItem() {
		return i.getName();
	}
	public boolean equals(Object obj) {
		return obj==i;
	}
}
