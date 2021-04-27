package oopIntro;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo V14",15000,"16 GB RAM"); // �rnek Olu�turma , Referans olu�turma, instance
	
//method ile g�nderme
		Product product2 = new Product(2,"Lenovo V15",15000,"16 GB RAM"); // �rnek Olu�turma , Referans olu�turma, instance
		
// Direkt g�nderme
		Product product3 = new Product(); // �rnek Olu�turma , Referans olu�turma, instance
		product3.id = 3;
		product3.name = "HP 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB RAM";

		Product[] products = { product1, product2, product3 };

		for (Product product : products) { // ekrana basma

			System.out.println(product.name);

		}
		System.out.println(products.length);

		Category category1 = new Category(1,"Elektronik");

		

		Category category2 = new Category();

		category2.id = 2;
		category2.name = "Ev / Bah�e";

		Category[] categories = { category1, category2 };

		for (Category category : categories) {
			System.out.println(category.name);

		}
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		productManager.addToCart(product2);
	

	}

}
