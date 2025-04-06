package BankAccountTypes;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(6253646, 10000);
        bankAccount.displayAccountType();
        bankAccount.displayAccountDetails();
        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount(55215511,10000,10);
        savingsAccount.displayAccountType();
        savingsAccount.displayAccountDetails();
        System.out.println();
//        savingsAccount.getTotalBalance();

        CheckingAccount checkingAccount = new CheckingAccount(5615211,1000,500,200);
        checkingAccount.displayAccountType();
        checkingAccount.displayAccountDetails();
        System.out.println();



        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(26484,5000);
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayAccountDetails();
    }
}
