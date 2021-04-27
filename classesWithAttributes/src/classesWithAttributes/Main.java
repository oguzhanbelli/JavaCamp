package classesWithAttributes;

public class Main {
	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Lenovo v11",10000,2);
		
		
		product.setId(1);
		product.setName("Laptop");
		product.setDesc("Lenovo V15");
		
		product.setPrice(5000);
		product.setStockAmount(5);
		
		
		ProductManager  productManager = new ProductManager();
		productManager.Add(product);
	
	}

}
