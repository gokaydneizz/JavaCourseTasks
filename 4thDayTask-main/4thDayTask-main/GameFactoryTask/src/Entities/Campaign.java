package Entities;

public class Campaign {
	private int campaignID;
	private String campaignName;
	private int amountOfDiscount;

	
	public int getCampaignID() {
		return campaignID;
	}
	public void setCampaignID(int campaignID) {
		this.campaignID = campaignID;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getAmountOfDiscount() {
		return amountOfDiscount;
	}
	public void setAmountOfDiscount(int amountOfDiscount) {
		this.amountOfDiscount = amountOfDiscount;
	}
}
