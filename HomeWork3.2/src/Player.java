
public class Player {
	private String firstName;
	private String lastNamae;
	private String idenityNumber;
	private String birthdayDate;
	
	public Player() {
		
	}
	
	public Player(String firstName, String lastNamae, String idenityNumber, String birthdayDate) {
		super();
		this.firstName = firstName;
		this.lastNamae = lastNamae;
		this.idenityNumber = idenityNumber;
		this.birthdayDate = birthdayDate;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNamae() {
		return lastNamae;
	}

	public void setLastNamae(String lastNamae) {
		this.lastNamae = lastNamae;
	}

	public String getIdenityNumber() {
		return idenityNumber;
	}

	public void setIdenityNumber(String idenityNumber) {
		this.idenityNumber = idenityNumber;
	}

	public String getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	 
	
	
}
