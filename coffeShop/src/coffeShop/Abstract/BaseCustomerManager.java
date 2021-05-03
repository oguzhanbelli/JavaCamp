package coffeShop.Abstract;
import coffeShop.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Databaseye kayýt edildi " + customer.getFirstName());
		
	}

}
