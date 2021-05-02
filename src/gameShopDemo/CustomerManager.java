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
		System.out.println("Kullan�c� Eklendi :"  + customer.getFirstName());

	}else {
	       System.out.println("Hatal� Bilgi");
	       
	}
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullan�c� Silindi :" + customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullan�c� G�ncellendi :  " + customer.getFirstName());

	}

}
