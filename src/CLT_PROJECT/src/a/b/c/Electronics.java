package a.b.c;

public class Electronics {
	
	private String company = null; 
	private String product = null;
	private int price = 0;
	
	public Electronics(String company, String product, int price) {
		this.company = company;
		this.product = product;
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
