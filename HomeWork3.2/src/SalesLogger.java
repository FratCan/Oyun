
public class SalesLogger implements Logger {

	 

	@Override
	public void log(Sales sales) {
		System.out.println("Oyun sat�n al�nd�: "+sales.getGamePrice());
		
	}
	
	 
	@Override
	public void log(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	 
}
