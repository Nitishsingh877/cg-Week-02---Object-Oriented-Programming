package BankAndAccountHolders;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Bank {
    private String name;
    private int balance;

    public void openAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name");
        name = sc.nextLine().trim();
        System.out.println("Enter the initial balance");
        balance = sc.nextInt();

    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int money){
        if(money < 0) {
            System.out.println("enter amount in positive");
        }else {
            balance += money;
        }
    }

    public void withdrawal(int money) {
        if(money>balance){
            System.out.println("insufficent balance!!");
        }else {
            System.out.println("Succesfully");
            balance -= money;
        }
    }
}
    


