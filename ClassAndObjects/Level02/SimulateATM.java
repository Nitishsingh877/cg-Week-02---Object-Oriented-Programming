import java.util.Scanner;

public class SimulateATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter account holder name : ");
        String accountHolder = input.nextLine();

        System.out.println("enter account number ");
        int accountNumber = input.nextInt();

        System.out.println("enter the initial balance");
        int balance = input.nextInt();
        BankAccount b1 = new BankAccount(accountHolder , accountNumber ,balance);
        System.out.println("how much to deposit");
        int money = input.nextInt();
        b1.DeposingMoney(money);

        System.out.println("how much to withdraw");
        int withdraw = input.nextInt();
        b1.Withdrawmoney(withdraw);

        b1.displayDetails();
    }
}

class BankAccount  {
    private String accountHolder;
    private int accountNumber;
    private int balance;

    public BankAccount (String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
//mrthod to deposit  money
    public void DeposingMoney(int money) {
        balance += money;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    public void Withdrawmoney(int withdraw) {
        if(withdraw>balance){
            System.out.println("insufficient balance");
        }else {
            balance = balance-withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);

        }
    }
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);

    }
}
