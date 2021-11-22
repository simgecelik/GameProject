import java.time.LocalDate;

import Adapters.MerniseServiceAdapters;
import Concretes.GamerManager;
import Concretes.GamesManager;
import Concretes.OfferManager;
import Entities.Gamer;
import Entities.Games;
import Entities.Offer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer("28861499108", "Engin", "Demiroð", 1985);
		Games game = new Games("Swat3", 69.90);
		Offer offer = new Offer("kz27ah", "Yýlbaþýna merhaba", LocalDate.of(2021, 11, 22), LocalDate.of(2021, 12, 30));

		GamerManager gamerManager = new GamerManager(new MerniseServiceAdapters());
		gamerManager.add(gamer);

		OfferManager offerManager = new OfferManager();
		offerManager.add(offer);

		GamesManager gamesManager = new GamesManager();
		gamesManager.sale(game, gamer);

	}

}
