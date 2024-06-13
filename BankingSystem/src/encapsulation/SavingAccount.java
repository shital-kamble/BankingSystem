package encapsulation;


public class SavingAccount extends Account {
    
	private double interestRate;

    
   public SavingAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
  
	   super(accountNumber, accountHolderName, balance, "Savings");
       
	   this.interestRate = interestRate;
    }

   
    public double getInterestRate() {
   
    	return interestRate;
    }

    public void setInterestRate(double interestRate) {
    
    	this.interestRate = interestRate;
    }

   
    @Override
    public void deposit(double amount) {
   
    	if (amount > 0) {
        
    		setBalance(getBalance() + amount);
            
	System.out.println("Deposited " + amount + ". New balance is " + getBalance());
    
    	} 
    	else
    	{
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        
    	if (amount > 0 && amount <= getBalance()) {
        
    		setBalance(getBalance() - amount);
            
    		System.out.println("Withdrew " + amount + ". New balance is " + getBalance());
        
    	}
    	else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    @Override
    public String getAccountInfo() {
       
    	return "Account Number: " + getAccountNumber() +
        
    			", Account Holder: " + getAccountHolderName() +
               
    			", Balance: " + getBalance() +
              
    			", Account Type: " + getAccountType() +
        
    			", Interest Rate: " + interestRate;
    	
    	
    }

    // Method to calculate interest
  
    public double calculateInterest() {
    
    	return getBalance() * interestRate / 100;
    }
}
