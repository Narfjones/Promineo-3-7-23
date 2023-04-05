public class CheckingAccount extends BankAccount{
    
    private double minBalance = 300.00;

    public CheckingAccount(String name, double deposit){
        super(name, deposit);
    }

    public double getMinBalance(){
        return minBalance;
    }



}
