package registerDemo2.business.concretes;

import registerDemo2.business.abstracts.UserLoginService;
import registerDemo2.entities.concretes.User;

public class UserLoginManager implements UserLoginService {
	private UserValidationManager userValidation;

	public UserLoginManager(UserValidationManager userValidation) {
		super();
		this.userValidation = userValidation;
	}

	@Override
	public boolean login(User user) {
		if (userValidation.Validation(user) == false) {
			if (user.getEmail().isEmpty() && user.getPass().isEmpty()) {
				System.out.println("Hatalý Giriþ");

			}
			return false;
		} else {
			System.out.println("Baþarýlý Giriþ : " + user.getEmail());
			return true;
		}

	}

	@Override
	public boolean logout(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
