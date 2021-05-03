package coffeShop.Concrete;

import coffeShop.Abstract.CustomerCheckService;

import coffeShop.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
