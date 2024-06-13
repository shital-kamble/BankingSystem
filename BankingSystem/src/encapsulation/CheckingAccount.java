package encapsulation;

public class CheckingAccount extends Account {
    
	private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
    
    	super(accountNumber, accountHolderName, balance, "Checking");
        
    	this.overdraftLimit = overdraftLimit;
    }

    
    public double getOverdraftLimit() {
    
    	return overdraftLimit;
    }

    
    public void setOverdraftLimit(double overdraftLimit) {
    
    	this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
   
    	if (amount > 0) {
        
    		setBalance(getBalance() + amount);
            
    		System.out.println("Deposited " + amount + ". New balance is " + getBalance());
        } 
    	else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        
    	if (amount > 0) {
        
    		if (checkOverdraft(amount)) {
            
    			setBalance(getBalance() - amount);
                
    			System.out.println("Withdrew " + amount + ". New balance is " + getBalance());
            } 
    		else {
                System.out.println("Withdrawal amount exceeds overdraft limit.");
            }
        } 
    	else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    @Override
    public String getAccountInfo() {
        
    	return "Account Number: " + getAccountNumber() +
               
    			", Account Holder: " + getAccountHolderName() +
                
    			", Balance: " + getBalance() +
                
    			", Account Type: " + getAccountType() +
                
    			", Overdraft Limit: " + overdraftLimit;
    }

    public boolean checkOverdraft(double amount) {
  
    	return (getBalance() + overdraftLimit) >= amount;
    }
}


