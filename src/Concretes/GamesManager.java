package Concretes;

import Abstract.GamesService;
import Entities.Gamer;
import Entities.Games;

public class GamesManager implements GamesService {

	@Override
	public void sale(Games games, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " kullan�c�s� " + games.getGameName() + " oyununa "
				+ games.getGamePrice() + " tutar�nda �deme yapm��t�r. ");

	}

}
