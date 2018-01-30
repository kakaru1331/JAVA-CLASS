package a.b.c;

public class Electronic {
	private String company = null;
	private String product = null;
	private int price = 0;
	
	public Electronic(String c, String p, int price) {
		this.company = c;
		this.product = p;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getProduct() {
		return product;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	
	
}
