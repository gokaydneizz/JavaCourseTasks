package Business;

import Entities.Campaign;
import Entities.Game;

public interface campaignService {
	public void newCampaign(Campaign campaign,Game game);
	public void updateCampaign(Campaign campaign,Game game);
	public void deleteCampaign(Campaign campaign,Game game);
}
