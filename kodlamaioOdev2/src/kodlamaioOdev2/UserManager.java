package kodlamaioOdev2;

public class UserManager extends BaseManager {
	public void List(User[] users) {
		for(User user : users) {
			System.out.println(user.getEmail());
			
		}
		
		

	}
	public void add(String message) {
		System.out.println("Kullanýcý Eklendi "+message);
	}

}
