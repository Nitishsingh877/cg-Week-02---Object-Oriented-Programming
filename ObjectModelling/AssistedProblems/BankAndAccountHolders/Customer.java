package BankAndAccountHolders;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String age;
    ArrayList<Bank> accounts;

    public Customer(String name, String age) {
        this.name = name;
        this.age = age;
        accounts = new ArrayList<>();
    }

    public void addAccount(Bank b1) {
        accounts.add(b1);
    }
//    public void getBankAccounts() {
//        for (Bank b:accounts) {
//            System.out.println(b);
//        }
//    }
    public void viewBalance() {
        int total = 0;
        for(Bank b: accounts){
            total+=b.getBalance();
        }
        System.out.println("Total balance = "+total);
    }
}
