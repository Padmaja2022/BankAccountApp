import java.util.LinkedList;
import java.util.List;

public class BankaccountApp {
	public static void main(String[] agrs) { 
		
	List<Account> accounts = new LinkedList<Account>();

   // read a CSV File create anew accounts based on that data
		String file ="C:\\Users\\PadmajaLanka\\eclipse-workspace\\bank_accounts.csv";
      List<String[]> newAccountHolder =  utilities.CSV.read(file);
            
      for(String[] accountHolder : newAccountHolder) {
    	 String name = accountHolder[0];
    	 String sSN =  accountHolder[1];
    	 String accountType =  accountHolder[2];
    	double initDeposit  =  Double.parseDouble(accountHolder[3]);
    	  
    	  System.out.println(name + " " + sSN + " " + accountType + "$"  + initDeposit);
    	  
    	  if(accountType.equals("Savings")) {
    		  accounts.add(new Checking(name,sSN,initDeposit));
    		  System.out.println("Open a Savings account");
    	  }else if (accountType.equals("Checking")) {
    		  
    		  System.out.println("Open a checking account");
    	  }
    	  else {
    		  System.out.println("Error reading account type");
    	  }
      }
      for(Account acc: accounts) {
    	  
    	  System.out.println("\n-----------");
    	  acc.showInfo();
      }
     
}
}