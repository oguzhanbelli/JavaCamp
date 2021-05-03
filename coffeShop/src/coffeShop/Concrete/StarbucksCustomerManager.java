package coffeShop.Concrete;

import coffeShop.Abstract.BaseCustomerManager;
import coffeShop.Abstract.CustomerCheckService;
import coffeShop.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Person checked");
		} else {
			System.out.println("Not a valid person!");
		}
	}
}
