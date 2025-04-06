package BankingSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankAccountArrayList = new ArrayList<>();

        SavingAccount s1 = new SavingAccount("53435695","nitish singh",50000,"SBI");
        CurrentAccount c1 = new CurrentAccount("2589632593","siddhu singh",20000,"hdfc");

        s1.deposits(5000);
        c1.withdraw(4000);


        bankAccountArrayList.add(s1);
        bankAccountArrayList.add(c1);

        for (BankAccount b:bankAccountArrayList
             ) {
            System.out.println("account number is "+ ((Loanable) b).hideAccountNUmber());
            System.out.println("account holder is "+ b.getHolderName());
            System.out.println("balance is " + b.getBalance());
            System.out.println("total intrest is " + b.calculateInterest());
            System.out.println("loan apply : " + ((Loanable )b).applyForLoan());
            System.out.println("eligible for loan or not ?" + ((Loanable)b).calculateLoanEligibility());
            System.out.println("----------------------");

        }
    }
}
