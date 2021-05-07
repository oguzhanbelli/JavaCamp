package registerDemo2.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import registerDemo2.dataAccess.abstracts.UserDao;
import registerDemo2.entities.concretes.User;

public class SignUpDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Email ile kayýt olundu");
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllMail() {
		List<User> list = new ArrayList<User>();
		list.add(new User(1,"ogibelli2@gmail.com","Oðuzhan","Belli","12345678"));
		list.add(new User(1,"ogibelli3@gmail.com","Oðuzhan","Belli","12345678"));
		return list;
	}

}
