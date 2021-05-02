package gameShopDemo;

public class firstLastNameVerification implements Verification {

	@Override
	public boolean verify(Customer customer) {
		if(customer.getFirstName().length() > 0  && customer.getLastName().length() >  0) {
			return true;
		}else {
			return false;
		}
	}

}
