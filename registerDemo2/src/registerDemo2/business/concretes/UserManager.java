package registerDemo2.business.concretes;

import java.util.List;

import registerDemo2.business.abstracts.UserService;
import registerDemo2.core.GoogleRegisterService;
import registerDemo2.dataAccess.abstracts.UserDao;

import registerDemo2.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private UserValidationManager userValidation;
	private GoogleRegisterService googleRegisterService;

	public UserManager(UserDao userDao, UserValidationManager userValidation,
			GoogleRegisterService googleRegisterService) {
		this.userDao = userDao;
		this.userValidation = userValidation;
		this.googleRegisterService = googleRegisterService;
	}

	@Override
	public void add(User user) {
		if (userValidation.Validation(user) == false) {
			System.out.println("Hatalý Giriþ");

			return;
		} else {
			this.userDao.add(user);

		}

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addWithGoogle(User user) {
		if (userValidation.Validation(user) == false) {
			System.out.println("Hatalý Giriþ");

			return;
		} else {
			this.googleRegisterService.registerWithGoogle(user);

		}
	}

}
