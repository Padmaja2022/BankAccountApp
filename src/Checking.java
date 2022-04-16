
public class Checking extends Account{





	//list of properties
	private int debitCardNumber;
	private int debitCardPin;


	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);

		accountNumber = "2" +accountNumber;		
		//System.out.println( "Account Number:"  + this.accountNumber);
		//System.out.println( "New Checking Account");
    setDebitCard();
	}
	
	@Override
	public void setRate() {
		 rate = getBaseRate() * .15;
		System.out.println("Implements rate for checking" +rate);
		
	}

	private void setDebitCard() {
		debitCardNumber	= (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
		System.out.println("Card:" + this.debitCardNumber);
		System.out.println("Pin:" + this.debitCardPin);
	}

	
	
	
	
	

	public void showInfo() {
	super.showInfo();
	System.out.println("Checking Account features: " +
	                     "\ndebit CardNumber: " + debitCardNumber +
	                     "\ndebit CardPin:"  + debitCardPin);
			
			
			
			
			
	
	
}



	
}