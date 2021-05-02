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
		System.out.println("Oyun Güncellendi " + game.getName());

	}

	@Override
	public void gameSale(Game game, Customer customer) {
		System.out.println(game.getName() + " Ýsimli oyun "  + customer.getFirstName()+ "'a Satýldý " );

	}

	@Override
	public void discount(Game game, Campaign campaign) {

		double discount = game.getPrice() - (game.getPrice() * campaign.getDiscountRate()) / 100;
		System.out.println("Oyun tutarý  :" +game.getPrice());
		double discountRatesys = game.getPrice() * campaign.getDiscountRate() / 100;
		System.out.println("Yapýlan indirim tutarý  :" +discountRatesys);
		System.out.println("Ýndirimden sonraki tutarýnýz : " + discount);

	}

}
