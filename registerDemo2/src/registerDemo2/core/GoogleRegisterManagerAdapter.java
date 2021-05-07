package registerDemo2.core;

import registerDemo2.entities.concretes.User;
import registerDemo2.googleservices.GoogleRegister;

public class GoogleRegisterManagerAdapter implements GoogleRegisterService {

	@Override

	public void registerWithGoogle(User user) {
		GoogleRegister register = new GoogleRegister();
		register.addUser(user);

	}

}
