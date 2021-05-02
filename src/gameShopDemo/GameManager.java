package gameShopDemo;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Eklendi " + game.getName());

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi " + game.getName());

	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun G�ncellendi " + game.getName());

	}

	@Override
	public void gameSale(Game game, Customer customer) {
		System.out.println(game.getName() + " �simli oyun "  + customer.getFirstName()+ "'a Sat�ld� " );

	}

	@Override
	public void discount(Game game, Campaign campaign) {

		double discount = game.getPrice() - (game.getPrice() * campaign.getDiscountRate()) / 100;
		System.out.println("Oyun tutar�  :" +game.getPrice());
		double discountRatesys = game.getPrice() * campaign.getDiscountRate() / 100;
		System.out.println("Yap�lan indirim tutar�  :" +discountRatesys);
		System.out.println("�ndirimden sonraki tutar�n�z : " + discount);

	}

}
