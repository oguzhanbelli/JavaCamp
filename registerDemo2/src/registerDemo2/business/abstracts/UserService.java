package registerDemo2.business.abstracts;

import java.util.List;

import registerDemo2.entities.concretes.User;

public interface UserService {
	void add(User user);

	void addWithGoogle(User user);

	List<User> getAll();
}
