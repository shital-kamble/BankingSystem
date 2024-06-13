package encapsulation;



public class Bank {

	private Account[] accounts;
    
	private int accountCount;

    public Bank(int initialCapacity) {
    
    	accounts = new Account[initialCapacity];
        
    	accountCount = 0;
    }

    public void addAccount(Account account) {
        
    	if (accountCount == accounts.length) {
        
    		resizeArray();
        }
        accounts[accountCount++] = account;
        
        System.out.println("Account added: " + account.getAccountInfo());
    }

      public void removeAccount(int accountNumber) {
         int index = -1;
         
         for (int i = 0; i < accountCount; i++) {
         
        	 if (accounts[i].getAccountNumber() == accountNumber) {
             
        		 index = i;
                
        		 break;
            }
        }

        
         if (index != -1) {
         
        	 System.out.println("Account removed: " + accounts[index].getAccountInfo());
            
        	 for (int i = index; i < accountCount - 1; i++) {
             
        		 accounts[i] = accounts[i + 1];
            }
           
        	 accounts[--accountCount] = null;
        } 
         else {
         
        	 System.out.println("Account not found.");
        }
    }

    public void displayAccounts() {
        
    	if (accountCount == 0) {
        
    		System.out.println("No accounts to display.");
        } else {
          
        	for (int i = 0; i < accountCount; i++) {
            
        		System.out.println(accounts[i].getAccountInfo());
            }
        }
    }

    private void resizeArray() {
        Account[] newArray = new Account[accounts.length * 2];
        
        System.arraycopy(accounts, 0, newArray, 0, accounts.length);
        
        accounts = newArray;
    }
}
