package BankingSystem;

abstract class BankAccount {
    private String accountNumber;
    private String  holderName;
    private double balance;


    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }



    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //concrete method

    public double deposits(double amount){
        balance = getBalance()+amount;
        return balance;
    }


    public double withdraw(double amount){
        if(amount>getBalance()){
            return -1;
        }else {
            balance = getBalance()-amount;
            return balance;
        }
    }

    //abstract
    abstract double calculateInterest();


}
