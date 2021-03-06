
public class SavingsAccount extends Account {
	
    private double interestRate;

    // default c
    public SavingsAccount() {
        super();
    }

    //Parameter c
    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // getter
    public double getInterestRate() {
        return this.interestRate;
    }
    //setter
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    //Calculating interest
    public double calcInterest() {
        return balance * interestRate;
    }

    public void applyInterest() {
        double interest = calcInterest();
        System.out.printf("Interest amount %.2f added to balance%n", interest);
        deposit(interest);
    }

    public void deposit(double amount) {

        
        if (amount > 0) {
            balance += amount;
            System.out.printf("Amount %.2f deposited\n", amount);
            System.out.printf("Current Balance is: %.2f\n", balance);

        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }

    public void withdraw(double amount) {

        
        if (amount > 0) {
            // Check suffi bal
            if ((amount) <= balance) {
                System.out.printf("Amount of %.2f withdrawn from Account\n", amount);
                balance -= amount;
                System.out.printf("Current Balance is: %.2f\n", balance);
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
	

}
