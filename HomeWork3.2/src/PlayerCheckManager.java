
public class PlayerCheckManager implements Check {
 
	@Override
	public boolean checkPerson(Player players) {
		 if(players.getFirstName()!=null && players.getIdenityNumber().length()==11 && players.getBirthdayDate().length()==4) {
			 System.out.println("Kontrol baþarýlý: "+players.getFirstName());
			 return true;
		 }else {
			 System.out.println("Kontrol baþarýsýz");
			 return false;
		 }
		 
	}
 

	 
 
	 

}
