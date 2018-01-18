package a.b.c;

public class JB {
	private String label = null;
	private String product = null;
	private int price = 0;
	
	public JB(String label, String product, int price) {
		this.label = label;
		this.product = product;
		this.price = price;
	}
	
	public String getLabel() {
		return label;
	}
	
	public String getProuct() {
		return product;
	}
	
	public int getPrice() {
		return price;
	}	
}
