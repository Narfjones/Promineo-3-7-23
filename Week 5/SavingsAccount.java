public class SavingsAccount extends BankAccount{
    
    // create a variable for the interest rate
    private double intRate = 2.34;

    // created the account through the parent object(super)
    public SavingsAccount(String name, double deposit){
        super(name, deposit);
    }

    // Returns new balance adjusted for interest
    public double calculateInterest(int years){
        double oldBalance = this.getAccountBalance();
        double newBalance = oldBalance* intRate *years;
        double interest = newBalance - oldBalance;
        this.deposit(interest);
        return newBalance;
    }

    // Updates the interest rate
    public void updateInterestRate(double newIntRate){
        intRate = newIntRate;
    }

}
