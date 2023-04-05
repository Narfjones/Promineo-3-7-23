import java.util.Random;

public class BankAccount {
    
    private String acctName;
    private int accountNumber;
    private double acctBalance;
    private int custID;

    // Constructor
    public BankAccount(String name, double deposit){
        // Set account name and account balance according to parameters
        acctName = name;
        acctBalance = deposit;

        // Generate a random ID and assign it to custID
        Random rand = new Random();
        int int_random = rand.nextInt(1000);
        custID = int_random;
    }


    // Getter Methods
    public double getAccountBalance(){
        return acctBalance;
    }

    public String getAccountName(){
        return acctName;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getCustId(){
        return custID;
    }

    // Setter Methods
    public void deposit(double deposit){
        acctBalance += deposit;
    }

}
