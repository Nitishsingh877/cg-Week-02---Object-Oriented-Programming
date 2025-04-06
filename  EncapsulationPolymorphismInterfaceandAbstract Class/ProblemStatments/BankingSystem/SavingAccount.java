package BankingSystem;


public class SavingAccount extends BankAccount implements Loanable  {
    private String bankName;

    public SavingAccount(String accountNumber, String holderName, double balance, String bankName) {
        super(accountNumber, holderName, balance);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    double calculateInterest() {
        return (getBalance()*0.7)/100; //mostly saving account have 7%  intrest
    }

    @Override
    public String  applyForLoan() {
        return ("loan application is submitted for "+ getHolderName());
    }

    @Override
    public Boolean calculateLoanEligibility() {
       if(getBalance()>30000){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public String hideAccountNUmber() {
        return "account number is " + maskedAccountNumber();
    }
    public String maskedAccountNumber(){
        return "****"+ (getAccountNumber().length()-4);
    }
}
