package Entities;

public class Game {
	private int gameID;
	private String nameOfGame;
	private int priceOfGame;
	private int rentPriceOfGame;
	
	
	
	public int getRentPriceOfGame() {
		return rentPriceOfGame;
	}
	public void setRentPriceOfGame(int rentPriceOfGame) {
		this.rentPriceOfGame = rentPriceOfGame;
	}
	public int getGameID() {
		return gameID;
	}
	public void setGameID(int gameID) {
		this.gameID = gameID;
	}
	public String getNameOfGame() {
		return nameOfGame;
	}
	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}
	public int getPriceOfGame() {
		return priceOfGame;
	}
	public void setPriceOfGame(int priceOfGame) {
		this.priceOfGame = priceOfGame;
	}
	
}
