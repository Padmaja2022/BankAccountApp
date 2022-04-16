
public class Savings extends Account{


	// List of properties	
	private double safetyDepositBoxID;
	private int SafetyDepositBoxKey;

	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" +accountNumber;

		//System.out.println( "Account Number:"  + this.accountNumber);
		//System.out.println( "New Savings Account");
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		 rate = getBaseRate() * .25;
		
	}
	
	
	
	public void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		SafetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
		System.out.println(safetyDepositBoxID);
	}


	public void showInfo() {
		
		
		super.showInfo();
		
		System.out.println("Saving Account Features:" + "\n safety DepositBox ID :" + safetyDepositBoxID +
		"\nSafety DepositBox Key :" + SafetyDepositBoxKey);
	}



	
	
	
}
