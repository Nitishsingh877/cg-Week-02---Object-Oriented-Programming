package BankAccountTypes;

public class CheckingAccount extends  BankAccount{
    private double deposit;
    private double withdrawl;

    public CheckingAccount(double accountNumber, double balance, double deposit, double withdrawl) {
        super(accountNumber, balance);
        this.deposit = deposit;
        this.withdrawl = withdrawl;
    }

    //deposit
    public double getDeposit(){
        return super.getBalance()+deposit;
    }

    public String getWithdrawl(){
        if(super.getBalance()<withdrawl){
            return "insufficient money";
        }else {
            double remaingMoney = super.getBalance()-withdrawl;
            return "successfully withdrawn and remaining amount is "+ remaingMoney;

        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("this is checking account type");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("successfully deposited");
        System.out.println("total money in account is " + getDeposit());
        System.out.println("withdrawal money is "+ getWithdrawl());


    }
}
