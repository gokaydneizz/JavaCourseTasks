package Business;

import Entities.Campaign;
import Entities.Game;

public class campaignManager implements campaignService{
	
	@Override
	public void newCampaign(Campaign campaign,Game game) {
		System.out.println("You have been logged in to " + campaign.getCampaignName() + "! New price is: " + (game.getPriceOfGame() - (game.getPriceOfGame() * campaign.getAmountOfDiscount() / 100)) + "€");
		
	}

	@Override
	public void updateCampaign(Campaign campaign,Game game) {
		System.out.println("You have been logged in to new campaign named " + campaign.getCampaignName() + "! New price is: " + (game.getPriceOfGame() - (game.getPriceOfGame() * campaign.getAmountOfDiscount() / 100)) + "€");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign,Game game) {
		System.out.println("You have been logged out from " + campaign.getCampaignName() + " price is still: " + game.getPriceOfGame() + "€");
		
	}
	
	
	


	

}
