Create a class called "BankAccount" that has the following properties and methods:
Properties:
 accountNumber (String)
 accountHolderName (String)
 accountBalance (double)
 accountType (String)
 accountStatus (boolean)
Methods:
 getAccountNumber(): String - returns the account number
 getAccountHolderName(): String - returns the account holder name
 getAccountBalance(): double - returns the account balance
 getAccountType(): String - returns the account type (e.g. Savings, Checking)
 isAccountActive(): boolean - returns the account status (active or inactive)
 creditAmount(double amount): void - adds the amount to the account balance
 debitAmount(double amount): void - subtracts the amount from the account balance, but only if the amount is less than or equal to the account balance and the account is active
 changeAccountHolderName(String name): void - changes the account holder name
 changeAccountType(String type): void - changes the account type
 closeAccount(): void - sets the account status to inactive
Additionally, add a class level variable called 'bankName' (String) and a class level method called 'getBankName()' that returns the bank name.
For this class, you should:
 Implement encapsulation
 Override toString() method to return a string representation of the account holder name, account number and account balance.
 Create a constructor which will take account number, account holder name, account type and bank name as input and will initialize these properties.
 Create another constructor which will take account number, account holder name, account type, account balance and bank name as input and will initialize these properties.
 Create a method called 'transfer(BankAccount toAccount, double amount)' which will transfer the amount from this account to the 'toAccount' if the account is active, account balance is greater than or equal to the amount and toAccount is active.
 Create a static method called 'getTotalDeposit()' which will return the total deposit of all the accounts created.
 Create a static variable called 'totalDeposit' which will keep track of total deposit of all the accounts.
 Create an Enum called 'AccountType' which will have the following options 'SAVINGS', 'CURRENT' and 'FIXED'.
 Create a factory method called 'getAccount(String type, String accountHolderName, double balance)' which will return the object of the child class of 'BankAccount' based on the type passed.
The above will cover all the OOPS concepts like inheritance, polymorphism, encapsulation, abstraction, static members, constructors, factory method, method overloading and overriding, exception handling and enums.
