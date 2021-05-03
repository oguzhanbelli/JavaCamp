package coffeShop;
import java.util.Calendar;
import java.sql.Date;


import coffeShop.Abstract.BaseCustomerManager;
import coffeShop.Adapters.MernisServiceAdapter;

import coffeShop.Concrete.StarbucksCustomerManager;
import coffeShop.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		// BaseCustomerManager customerManager = new NeroCustomerManager(new
		// MernisServiceAdapter());
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Date bDate = new Date(1999, 06, 18);
		Customer customer = new Customer(1, "Oğuzhan", "Belli", bDate, "26209402308");

		customerManager.save(customer);
	}

}
