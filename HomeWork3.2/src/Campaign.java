
public class Campaign {
	
	private String kampanyaName;
	private String kampanyaTime;
	private String kampanyaDiscount;
	
	public Campaign() {
		
	}
	
	public Campaign(String kampanyaName, String kampanyaTime, String kampanyaDiscount) {
		super();
		this.kampanyaName = kampanyaName;
		this.kampanyaTime = kampanyaTime;
		this.kampanyaDiscount = kampanyaDiscount;
	}
	
	public String getKampanyaName() {
		return kampanyaName;
	}


	public void setKampanyaName(String kampanyaName) {
		this.kampanyaName = kampanyaName;
	}


	public String getKampanyaTime() {
		return kampanyaTime;
	}


	public void setKampanyaTime(String kampanyaTime) {
		this.kampanyaTime = kampanyaTime;
	}


	public String getKampanyaDiscount() {
		return kampanyaDiscount;
	}


	public void setKampanyaDiscount(String kampanyaDiscount) {
		this.kampanyaDiscount = kampanyaDiscount;
	}


	 
}
