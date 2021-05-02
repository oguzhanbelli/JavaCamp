package gameShopDemo;

public class nationalityIdVerification implements Verification {

	@Override
	public boolean verify(Customer customer) {
		if (customer.getNationalityId().length() == 11) {
			return true;
		} else {
			return false;
		}
	}

}
