package encapsulation;

public abstract class Account {
    
	private int accountNumber;
    
	private String accountHolderName;
    
	private double balance;
    
	private String accountType;

    
    public Account(int accountNumber, String accountHolderName, double balance, String accountType) {
     
    	this.accountNumber = accountNumber;
        
    	this.accountHolderName = accountHolderName;
        
    	this.balance = balance;
        
    	this.accountType = accountType;
    }

    
    public abstract void deposit(double amount);
    
    public abstract void withdraw(double amount);
    
    public abstract String getAccountInfo();

  
    public int getAccountNumber() {
        
    	return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
       
    	this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        
    	return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        
    	this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        
    	return balance;
    }

    public void setBalance(double balance) {
        
    	this.balance = balance;
    }

    public String getAccountType() {
        
    	return accountType;
    }

    public void setAccountType(String accountType) {
        
    	this.accountType = accountType;
    }
}
