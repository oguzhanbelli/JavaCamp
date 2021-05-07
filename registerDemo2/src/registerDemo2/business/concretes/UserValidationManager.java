package registerDemo2.business.concretes;

import java.util.regex.Pattern;

import registerDemo2.business.abstracts.UserValidationService;
import registerDemo2.dataAccess.abstracts.UserDao;
import registerDemo2.entities.concretes.User;
import registerDemo2.utils.Validations;

public class UserValidationManager implements UserValidationService {

	private UserDao userDao;

	public UserValidationManager(UserDao userDao) {

		this.userDao = userDao;
	}

	@Override
	public boolean passwordValidation(User user) {
		if (user.getPass().length() < 6) {
			System.out.println("Parola 6 karakterden küçük olamaz");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean emailValidation(User user) {
		String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(user.getEmail()).find();
	}

	@Override
	public boolean firstLastNameValidation(User user) {
		if (user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		} else {
			System.out.println("Ýsim ve soyisim 2 karakterden küçük olamaz");
			return false;
		}
	}

	@Override
	public boolean Validation(User user) {
		boolean validation = Validations.run(passwordValidation(user), emailValidation(user),
				firstLastNameValidation(user), emailExistValidation(user));

		return validation;
	}

	@Override
	public boolean emailExistValidation(User user) {
		for (User email : userDao.getAllMail()) {
			if (email.getEmail().equals(user.getEmail())) {
				System.out.println("Kayýtlý Email");
				return false;

			}

		}
		return true;

	}
}