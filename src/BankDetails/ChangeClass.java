package BankDetails;

public class ChangeClass extends BankAccount implements Changes{
	    @Override
	    public void changeAccountName(String AccountNumb, String Name,BankAccount value){
	    	
	        value.setAccountHolderName(Name);
	        System.out.println("Account Holder Name Changed Successfully ");
	    }
	    @Override
	    public void changeAccountType(String accNum, String accountT,BankAccount value) {
	        value.setAccountType(accountT);
	        System.out.println("Account Type Changed Succefully");
	    }

}


