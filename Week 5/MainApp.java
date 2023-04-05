public class MainApp {
    
    public static void main(String[] args){

        String name = "Matt Kilmer";
        double deposit = 500.00;

        SavingsAccount acct = new SavingsAccount(name, deposit);
        CheckingAccount acct2 = new CheckingAccount(name);

        System.out.println("Your previous balance was:");
        System.out.println(acct.getAccountBalance());

        acct.deposit(1000);

        System.out.println("Your new balance is: ");
        System.out.println(acct.getAccountBalance());

        printAccountBalance(acct);
        printAccountBalance(acct2);

    }

    public static void isGreaterThanMin(CheckingAccount acct){

        if(acct.getAccountBalance() > acct.getMinBalance()){
            System.out.println("Your balance is sufficient. Get on outta here.");
        } else {
            System.out.println("Where's my money?");
        }

    }

    public static void printAccountBalance(BankAccount acct){
        System.out.println(acct.getAccountBalance());
        System.out.println(acct.getAccountBalance());
        System.out.println(acct.getAccountBalance());
        System.out.println(acct.getAccountBalance());
        System.out.println(acct.getAccountBalance());
    }


}
