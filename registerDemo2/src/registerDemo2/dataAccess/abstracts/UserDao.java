package registerDemo2.dataAccess.abstracts;

import java.util.List;

import registerDemo2.entities.concretes.User;

public interface UserDao {
	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	User[] getAll();

	// List kullanýlýr Product[] yerine.!
	List<User> getAllMail();
}
