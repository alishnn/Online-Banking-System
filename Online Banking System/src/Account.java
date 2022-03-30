
public abstract class Account {
	
    private int accountNumber;

    
    protected double balance; 

    //def Con
    public Account() {

    }
    //par Con
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0; 
    }

    // Getter but no setter
    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    //abstract methods functions to deposit
    // applying trans for checking but no fee for savings
    public abstract void deposit(double amount); 

        
    public abstract void withdraw(double amount); 
}
