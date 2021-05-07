package registerDemo2.business.abstracts;

import registerDemo2.entities.concretes.User;

public interface UserLoginService {
	boolean login(User user);

	boolean logout(User user);

}
