package gameShopDemo;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Date cDate = new Date(18, 06, 1999);
		Customer oguzhan = new Customer(1, "Oðuzhan", "Belli", cDate, "26209402308");
		Game game = new Game(1, "World", 1500);
		Campaign campaign = new Campaign(1, "Kayýt Bonusu", 15);
		CustomerManager customerManager = new CustomerManager(new firstLastNameVerification());
		customerManager.add(oguzhan);

		GameManager gameManager = new GameManager();
		gameManager.gameSale(game, oguzhan);
		;
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		gameManager.discount(game, campaign);

	}

}
