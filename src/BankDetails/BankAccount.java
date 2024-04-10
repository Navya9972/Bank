package BankDetails;
import java.util.ArrayList;
public class BankAccount implements BankInterface
{
  private String accountNumber;
  private String accountHolderName;
  private  double accountBalance;
  private String accountType;
  private boolean accountStatus;
  private static String bankName = "Navya Bank"; //  it is a class level variable
  private static double totalDeposit = 0.0;   //static variable which will keep track of all total deposit of all account.
  private static ArrayList<BankAccount> accounts = new ArrayList<>();
  
  
//constructor with five properties
  public BankAccount(String accountNumber, String accountHolderName, double accountBalance, String accountType,boolean accountStatus) {
      this.accountNumber = accountNumber;
      this.accountHolderName = accountHolderName;
      this.accountBalance = accountBalance;
      this.accountType = accountType;
      this.accountStatus = accountStatus;
      totalDeposit += accountBalance;
      accounts.add(this);
  }
  
  //constructor with four properties
//  public BankAccount(String accountNumber, String accountHolderName, String accountType, String bankName) {
//      this.accountNumber = accountNumber;
//      this.accountHolderName = accountHolderName;
//      this.accountType = accountType;
//      BankAccount.bankName = bankName;
//      this.accountStatus = true;
//      accounts.add(this);
//  }
  public BankAccount()
  {
  	//empty constructor
  }
   
  // Usage of encapsulation concept 
  
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public  double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public boolean isAccountStatus() {
	return this.accountStatus;
}
public void setAccountStatus(boolean accountStatus) {
	this.accountStatus = accountStatus;
}

public static String getBankName() {
    return bankName;                    //returns class level bank name = that is Navya Bank
}

@Override
public String toString() {
	return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
			+ ", accountBalance=" + accountBalance + "]";
}

//deposit
public void creditAmount(double amount,BankAccount value) {
	amount=value.getAccountBalance()+amount;
	value.setAccountBalance(amount);	
	BankAccount.totalDeposit += amount;
}
//withdraw
public  void debitAmount(double number1,BankAccount value)  {
	 if (value.accountStatus &&( value.getAccountBalance() >=number1) ) {
	       number1 = value.getAccountBalance() - number1;
	      value.setAccountBalance(number1);	
	        BankAccount.totalDeposit -= number1;
	    }
	    else {
	        System.out.println("Transaction failed. Please check your account balance or account status.");
	    }
      }

//transfer
   public   void transfer(BankAccount value, double amount) throws Exception
   		
   {
	        //System.out.println(value.accountStatus);
	   		if (!this.accountStatus) {
	            throw new Exception("This account is inactive");
	        }
	        if (amount > this.accountBalance) {
	            throw new Exception("Insufficient balance");
	        }
	        if (value.isAccountStatus()== false) {
	            throw new Exception("Recipient account is inactive");
	        }
	        this.accountBalance -= amount;
//	        value.setAccountBalance( value.accountBalance);
	        this.creditAmount(amount,value);
	    }

   
   
  public static double getTotalDeposit() {       //return total deposits of all accounts
    return totalDeposit;
}
  
  
  public static AccountType getAccount(String type, String accountHolderName, double balance) {
		AccountType accountType = null;
		switch (type.toUpperCase()) {
		case "SAVING":
			accountType = AccountType.SAVING;
			break;
		case "CURRENT":
			accountType = AccountType.CURRENT;
			break;
		case "FIXED":
			accountType = AccountType.FIXED;
			break;
		}
		return accountType;
	}
}



