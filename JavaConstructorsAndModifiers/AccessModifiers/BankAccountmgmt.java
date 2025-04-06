public class BankAccountmgmt {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.displayDetails();

        BankAccount b2 = new BankAccount(75445692, "nitish singh", 85000);
        b2.displayBalance();
        b2.updatedBalance(850);
        b2.displayBalance();
        b2.displayDetails();

        SavingAccount s1 = new SavingAccount(5616584, "siddhu singh",8500,"saving");
        s1.displayUsingSubClss();

    }
}

class BankAccount {
    public long accountNumber;
    protected String  accountHolder;
    private int balance;

    BankAccount() {
        accountNumber = 12345678;
        accountHolder ="guest";
        balance = 0;
    }

    //parametrised const
    BankAccount(long accountNumber, String accountHolder, int balance) {
        this.accountHolder =accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayBalance () {
        System.out.println("balance is $ "+ balance);
    }

    public void updatedBalance(int updatedBalance) {
        balance = updatedBalance;
    }

    void displayDetails() {
        System.out.println("account number is " + accountNumber);
        System.out.println("account holder is "+ accountHolder);
        System.out.println("balance is $"+ balance);
    }
}

class SavingAccount extends BankAccount {
    private String accountType;

    //constructor
    SavingAccount(long accountNumber, String accountHolder, int balance, String accountType) {
        super(accountNumber,accountHolder,balance);
        this.accountType = accountType;
    }

    void displayUsingSubClss() {
        System.out.println("account number is " + accountNumber);
        System.out.println("Account holder is" + accountHolder);
        System.out.println("account type is "+ accountType);
        //System.out.println("balance is "+ balance);
        //because balance  is private
    }
}
