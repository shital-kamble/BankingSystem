package encapsulation;


public class Main {

	public static void main(String[] args) {
    
		Bank bank = new Bank(2); // Initial capacity of 2

        SavingAccount savingAccount = new SavingAccount(12345, "Shital Kamble", 1000.0, 3.5);
     
        CheckingAccount checkingAccount = new CheckingAccount(67890, "Abhijit  Gund", 500.0, 4.5);

       
        bank.addAccount(savingAccount);
        
        bank.addAccount(checkingAccount);

        bank.displayAccounts();

        savingAccount.deposit(500);
        checkingAccount.withdraw(600);

        bank.displayAccounts();

        bank.removeAccount(12345);

        bank.displayAccounts();
    }
}
