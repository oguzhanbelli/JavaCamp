package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		System.out.println("Ürün Eklendi "+product.getName());
		System.out.println(product.getKod());
		
	}
	
	public void Add2(int id,String name,String desc,int stockAmount,double price) {
		//PRODUCT'I GÖNDER ATTRÝBUTELARI DEÐÝL.!
		
		
	}

}
