
public class main {

	public static void main(String[] args) {
		 
		Player child= new Player("Fýrat","Özdemir","11111111111","2001");
		Player normal=new Player("Elif","Özdemir","22222222222","2008");
		
		Campaign campaign1=new Campaign("Hafasonu indirimi","2 gün","%25");
		 
		Sales sales1=new Sales("100 TL"); 
		
		Logger [] loggers= {new SalesLogger(),new CampaignLogger()};
		
		
		PlayerManager playerManager=new PlayerManager(loggers);
		playerManager.add(normal, sales1, campaign1);
	}

}
