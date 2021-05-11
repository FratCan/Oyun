
public class CampaignLogger implements Logger {

	@Override
	public void log(Campaign campaign) {
		 System.out.println("Kampanya eklendi: "+campaign.getKampanyaName());
		
	}
	
	public void delete(Campaign campaign) {
		System.out.println("Kapmanya kaldýrýldý: "+campaign.getKampanyaName());
	}

	@Override
	public void log(Sales sales) {
		// TODO Auto-generated method stub
		
	}

}
