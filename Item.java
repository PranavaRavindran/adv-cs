
public class Item {
	
	private String n;
	private double p;
	private int bQ;
	private double bP;
	
	public Item(String name, double price) {
		n = name;
		p = price;
	}
	public Item(String name, double price, int bulkQty, double bulkPrice) {
		this(name, price);
		bQ = bulkQty;
		bP = bulkPrice;
		if(price<=0 || bulkQty<=0 || bulkPrice<=0) {
			throw new IllegalArgumentException("error");
			
		}
	}
	public double priceFor(int quantity) {
		if(quantity<=0) {
			throw new IllegalArgumentException("error");
		}
		double i = 0;
		if(quantity>=bQ) {
			i = bP*quantity;
			return i;
		}
		i = quantity*p;
		return p;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==n) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String r = "";
		r+= n+","+" "+p;
		if(bQ>0) {
			r+= "("+bQ+" for "+bP;
		}
		return r;
	}
}
