package registerDemo2.business.abstracts;

import registerDemo2.dataAccess.abstracts.UserDao;
import registerDemo2.entities.concretes.User;

public interface UserValidationService {
	boolean passwordValidation(User user);

	boolean emailValidation(User user);

	boolean firstLastNameValidation(User user);

	boolean Validation(User user);

	boolean emailExistValidation(User user);



}
