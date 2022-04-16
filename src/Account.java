
public abstract class  Account implements IBaseRate{
	
	// List common properties for savings and checking accounts
	
	private String name;
	private String SSN;
	private double balance;	
	static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	
	public Account(String name, String sSN, double initDeposit) {
		super();
		this.name = name;
		SSN = sSN;
		balance = initDeposit;
		//System.out.println("Name: " +name + "SSN: " +sSN + "Balence :$" +balance);
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println(getBaseRate());
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = SSN.substring(SSN.length()-2, SSN.length()) ;
		int uniqID = index;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN+ uniqID + randomNumber;
		
	}
	//List common methods-Transactions
	
	public void compound() {
		
		double compoundInterest = balance * (rate/100);
		balance = balance + compoundInterest;
		System.out.println("compoundInterest $" + compoundInterest);
		printBalance();
	
	}
	
	
	
	
	
	
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Depositing $" +amount);	
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("withdrawing $" +amount);
		printBalance();
	}
	
	public void transfer(String towhere, double amount) {
		
		balance= balance- amount;
		System.out.println("Transfering $ " +amount + "to" +towhere);
		printBalance();
	}
		
	
	public void printBalance() {
		
		System.out.println("Balance $ " + balance);
	}
	
	public void showInfo() {
	
		System.out.println("Name :" + name +
				"\n Account Number: " +accountNumber +
				"\nBalance: " + balance +"\nRate:"+ rate  + " % "
				);
				
				
				
				
				
		
		
	}

}
