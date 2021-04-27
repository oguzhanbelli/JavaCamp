package oopIntro;

public class Product {
	public Product() {
		System.out.println("Selam");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();//parametresiz constructor çalýþtýr.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	

	int id;
	String name;
	double unitPrice;
	String detail;

}
