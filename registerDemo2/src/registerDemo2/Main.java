package registerDemo2;

import registerDemo2.business.abstracts.UserLoginService;
import registerDemo2.business.abstracts.UserService;
import registerDemo2.business.concretes.UserLoginManager;
import registerDemo2.business.concretes.UserManager;
import registerDemo2.business.concretes.UserValidationManager;
import registerDemo2.core.GoogleRegisterManagerAdapter;
import registerDemo2.dataAccess.concretes.SignUpDao;
import registerDemo2.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new SignUpDao(), new UserValidationManager(new SignUpDao()),
				new GoogleRegisterManagerAdapter());// referansýný

		// tuttur.
		User user = new User(1, "ogibelli6@gmail.com", "Oss", "Bss", "12345678");
		User user2 = new User(1, "Ogi1@gmail.com", "Oss", "Bss", "12345678");
		userService.add(user);
		userService.addWithGoogle(user2);
		UserLoginService userLoginService = new UserLoginManager(new UserValidationManager(new SignUpDao()));
		userLoginService.login(user2);

	}

}
