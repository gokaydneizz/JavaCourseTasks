package Business;

import Entities.*;


public class MainClasss {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserName("quArex");
		user1.setPassword(123456);
		user1.setName("Engin");
		user1.setLastName("Demirog");
		user1.setNationalId("12345678911");
		user1.setBirthDay(2005);
		
		User user2 = new User();
		user2.setUserName("exZman");
		user2.setPassword(153123);
		user2.setLastName("Sahan");
		user2.setName("Mahmut");
		user2.setNationalId("10038012341");
		user2.setBirthDay(2001);
		
		Game game1 = new Game();
		game1.setGameID(1);
		game1.setNameOfGame("League Of Legends");
		game1.setPriceOfGame(100);
		
		Game game2 = new Game();
		game2.setGameID(2);
		game2.setNameOfGame("Osu");
		game2.setPriceOfGame(10);
		game2.setRentPriceOfGame(5);
							
		gameSeller seller1 = new gameSeller();
		seller1.setSellerId(1);
		seller1.setName("Senol");
		
		gameSeller seller2 = new gameSeller();
		seller2.setSellerId(2);
		seller2.setName("Mahmut");
		
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignID(1);
		campaign1.setAmountOfDiscount(10);
		campaign1.setCampaignName("%10 discount");
		
		Campaign campaign2 = new Campaign();
		campaign2.setAmountOfDiscount(12);
		campaign2.setCampaignID(2);
		campaign2.setCampaignName("%12 discount");
		
		gamerManager gamerManager = new gamerManager();
		gamerManager.add(user2);
		gamerManager.update(user2);
		gamerManager.delete(user2);
		System.out.println("-----------");
		
		
		gamerManager.add(user1);
		gamerManager.update(user1);
		gamerManager.delete(user1);
		
		System.out.println("----------");
	
		campaignManager campaignManager = new campaignManager();
		campaignManager.newCampaign(campaign1, game1);
		campaignManager.updateCampaign(campaign2, game1);
		campaignManager.deleteCampaign(campaign1, game1);
		
		System.out.println("-----------");
		
		gameSellingManager sellerManager = new gameSellingManager();
		sellerManager.Sell(game1, user2, seller1);
		sellerManager.Rent(game2, user1, seller2);
		
		
		

	}

}
