package Business;

import Entities.Game;
import Entities.User;
import Entities.gameSeller;

public class gameSellingManager implements gameSellingService {
	
	@Override
	public void Sell(Game game, User user,gameSeller seller) {
		System.out.println("The game called: " + game.getNameOfGame() + " is sold to a user named: " + user.getName() +
				" by a seller named: " + seller.getName() + " for " + game.getPriceOfGame() + " €");
		
	}

	@Override
	public void Rent(Game game, User user, gameSeller seller) {
		System.out.println("The game called: " + game.getNameOfGame() + " is rented for a day to a user named: " + user.getName() + 
				" by a seller named: "	+ seller.getName() + " for " +  game.getRentPriceOfGame() + " €");		
	}
	
}
