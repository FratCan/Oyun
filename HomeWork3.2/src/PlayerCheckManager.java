
public class PlayerCheckManager implements Check {
 
	@Override
	public boolean checkPerson(Player players) {
		 if(players.getFirstName()!=null && players.getIdenityNumber().length()==11 && players.getBirthdayDate().length()==4) {
			 System.out.println("Kontrol ba�ar�l�: "+players.getFirstName());
			 return true;
		 }else {
			 System.out.println("Kontrol ba�ar�s�z");
			 return false;
		 }
		 
	}
 

	 
 
	 

}
