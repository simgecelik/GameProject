package Entities;

public class Games {

	private String gameName;
	private double gamePrice;

	public Games(String gameName, double gamePrice) {
		super();
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

}
