package gameShopDemo;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update (Game game);
	
	void gameSale(Game game,Customer customer);
	void discount(Game game,Campaign campaign);

}
