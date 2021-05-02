package gameShopDemo;

public class CustomerManager implements CustomerService {
	Verification verification;

	public CustomerManager(Verification verification) {
		super();
		this.verification = verification;
	}

	@Override
	public void add(Customer customer) {
	if(verification.verify(customer)) {
		System.out.println("Kullanýcý Eklendi :"  + customer.getFirstName());

	}else {
	       System.out.println("Hatalý Bilgi");
	       
	}
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanýcý Silindi :" + customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanýcý Güncellendi :  " + customer.getFirstName());

	}

}
