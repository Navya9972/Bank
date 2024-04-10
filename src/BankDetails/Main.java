package BankDetails;
import java.util.*;
public class Main {
	
	public static void main(String args[]) throws Exception
	{
		HashMap<String,BankAccount> bank=new HashMap<String,BankAccount>();
		 ChangeClass c=new ChangeClass();
		 BankAccount b = new BankAccount();
		
		
		while(true) 
		{
			System.out.println("1.Create a Bank account :");
			System.out.println("2. Display Account Details :");
			System.out.println("3.Credit Amount :");
			System.out.println("4.Debit Amount :");
			System.out.println("5.Transfer Account :");
			System.out.println("6.Get all total deposits of the bank :");
			System.out.println("7.Change Account holder Name:");
			System.out.println("8.Change Account holder Type:");
			System.out.println("9.Exit:");
			Scanner sc = new Scanner(System.in);
			System.out.println("Chose your Option :");
			int option = sc.nextInt();
			switch(option)
			{
			case 1 : System.out.println("Enter your details");
			        System.out.println("Enter your Account Number");
			        String accno=sc.next();
			        System.out.println("Enter the account holdr name");
			        String accHolderName=sc.next();
			        System.out.println("Enter the amount");
			        double amount1=sc.nextDouble();
			        System.out.println("Enter account type");
			        String accTpe=sc.next();
			        System.out.println("Enter the account status");
			        boolean as=sc.nextBoolean();
			        
			       
			        bank.put(accno,new BankAccount(accno,accHolderName,amount1,accTpe,as));
			        break;
			
			case 2:// display
				    System.out.println("Your Account Details are here !!!");
				    for(Map.Entry<String,BankAccount> map:bank.entrySet())
				    {
				    String key=map.getKey();
				    BankAccount value=map.getValue();
				   
				    	//System.out.println("Account number :" +i);
				    	System.out.println("---------------------------------------------------");
				    	System.out.println("Account Holder Name :" +value.getAccountHolderName());
				    	System.out.println("Account Balance : " +value.getAccountBalance());
				    	System.out.println("Account Account Type :"  +value.getAccountType());
				    	System.out.println("Account Status: ." +value.isAccountStatus()+".");
				    	System.out.println("---------------------------------------------------");
				      	
				    }
				    break;
				    
			case 3: //Credit Amount
				System.out.println("enter Account Number:");
				 String ac=sc.next();
				 System.out.println("Enter amount to credit");
				 double amount=sc.nextDouble();
				 for(Map.Entry<String,BankAccount> entry:bank.entrySet()){    
				        String key=entry.getKey();  
				        BankAccount value=entry.getValue(); 
				        int k =0;
				        if(key.equals(ac))
				        {
				 
				        	b.creditAmount(amount,value);
				        	k+=1;
				        	System.out.println("it is credited Succesfully !!!");
				        }
				        if (k>1 && k==0)
				        {
				        	System.out.println("No Account Found");
				        }

			    	  }
			      
				  break;
				  
			case 4: // Debit  Amount
				System.out.println("enter Account Number:");
				 String ac2=sc.next();
				 System.out.println("Enter amount to Debit");
				 double amount2=sc.nextDouble();
				 for(Map.Entry<String,BankAccount> entry:bank.entrySet()){    
				        String key=entry.getKey();  
				        int k=0;
				        BankAccount value=entry.getValue();   
				        if(key.equals(ac2))
				        {
				 
				        	
							b.debitAmount(amount2,value);
							k+=1;
							System.out.println("it is debited Succesfully !!!");
				        }
				        if(k>1 && k==0)
				        {
				        	System.out.println("No Account Found");
				        }
			    	  }
				  
			  break;
			  
			case 5: //Transfer account 
				System.out.println("enter Account Number:");
				 String ac3=sc.next();
				 System.out.println("enter the balance to transfer :");
				 double amount3 = sc.nextDouble();
				 System.out.println("Enter the Account number to transfer :");
				 String ac4 = sc.next();
				 BankAccount MA= new BankAccount();
				 BankAccount TA= new BankAccount();
				 int k=0;
				 for(Map.Entry<String,BankAccount> entry:bank.entrySet()){    
				        String key=entry.getKey();  
				        BankAccount value=entry.getValue();  
				        k = 0;
				        if(key.equals(ac3)||key.equals(ac4))
				        {
				        	if(key.equals(ac3))
				        		
				        	{
				        		MA=value; // main Account 
				        		
				        	}
				        	else
				        	{
				        		TA=value; // To Account
				        		
				        	}
							k+=1;
							
				        }
				        if(k>1 && k==0)
				        {
				        	System.out.println("No Account Found");
				        }

			    	  }
				 if(k==1) {
					 MA.transfer(TA,amount3); // calling transfer function of main account.
			         System.out.println("it is transferred Succesfully !!!");
				 }
				  
			  break;
			case 6: //get all deposit 
				System.out.println(BankAccount.getTotalDeposit());
				break;
				
			case 7: //change account holder name 
				System.out.println("enter Account Number:");
				 String bat=sc.next();
				 System.out.println("Enter the Name to be changed:");
				 String Name =sc.next();
				 for(Map.Entry<String,BankAccount> entry:bank.entrySet()){    
				        String key=entry.getKey();  
				        BankAccount value=entry.getValue(); 
				        k=0;
				        if(key.equals(bat))
				        {
				 
				        	c.changeAccountName(bat,Name,value);
				        	k+=1;
				        }
				        if(k>1 && k==0)
				        {
				        	System.out.println("No Account Found");
				        }

			    	  }
			      
				  break;
				  
			case 8://Change Account type
				System.out.println("enter Account Number:");
				 String bate=sc.next();
				 System.out.println("Enter the type to be changed:");
				 String type =sc.next();
				 for(Map.Entry<String,BankAccount> entry:bank.entrySet()){    
				        String key=entry.getKey();  
				        k =0;
				        BankAccount value=entry.getValue();   
				        if(key.equals(bate))
				        {
				 
				        	c.changeAccountType(bate,type,value);
				        	k+=1;
				        }
				        if(k>1 && k==0)
				        {
				        	System.out.println("No Account Found");
				        }

			    	  }
				 break;
				 
			case 9 ://Exit 
				System.exit(0);
				
		}
	}
	}
}
			        
			        
			        
			        
			
	
