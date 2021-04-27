package classesWithAttributes;

public class Product {
	
	public Product(int _id,String _name,String _desc,double _price,int _stockAmount) {
		System.out.println("Yapıcı Blok çalıştı");//newlediðimizde çalýþýr.
		this._id = _id;
		this._desc = _desc;
		this._name = _name;
		this._stockAmount = _stockAmount;
	
	}
	public Product() {
		
	}
	// attribute | field
	private int _id;
	private String _name;
	private String _desc;
	private double _price;
	private int _stockAmount;
	

	// Methodlar burda yazýlmaz.!!!!!! 'S'OLID.
	// private sadece o blokta geçerli.
	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		_id = id;
		// this ile eþitleme yapýlýr !! veya baþýna _ koyulur.
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getDesc() {
		return _desc;
	}

	public void setDesc(String _desc) {
		this._desc = _desc;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double _price) {
		this._price = _price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String getKod() {
		return _id + this._name.substring(0, 1);
	}

}
