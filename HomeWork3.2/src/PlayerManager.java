
public class PlayerManager {
	
	
	
	
	
	
	Check check=new PlayerCheckManager();
	
	
	
	private Logger [] loggers;
 

	public PlayerManager(Logger[] loggers) {
		 
		
		this.loggers = loggers;
	}




	public void add(Player player,Sales sales,Campaign campaign) {
		
		if(check.checkPerson(player)) {
			System.out.println("Oyuncu eklendi: "+player.getFirstName());
			
			
			 for (Logger logger : loggers) {
				logger.log(campaign);
				logger.log(sales);
			}
			
		}else {
			System.out.println("Oyuncu eklenemedi");
		}
		 
		 
	}
	
	
	
	public void delete(Player player,Sales sales,Campaign campaign) {
		System.out.println("Oyuncu silindi: "+ player.getFirstName());
		for (Logger logger : loggers) {
			logger.log(campaign);
			logger.log(sales);
		}
		 
	}



}




/*
//this.logger.log(sales);
		//this.logger.log(campaign);
*/