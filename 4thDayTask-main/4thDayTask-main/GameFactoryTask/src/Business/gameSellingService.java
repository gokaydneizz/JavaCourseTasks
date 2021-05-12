package Business;

import Entities.Game;
import Entities.User;
import Entities.gameSeller;

public interface gameSellingService {
	public void Sell(Game game,User user,gameSeller seller);
	public void Rent(Game game,User user,gameSeller seller);
	
}
