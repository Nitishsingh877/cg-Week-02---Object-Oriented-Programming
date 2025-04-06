package BankingSystem;


public class CurrentAccount extends BankAccount implements Loanable  {
    private String bankName;

    public CurrentAccount(String accountNumber, String holderName, double balance, String bankName) {
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
        return (getBalance()*1.5)/100; //mostly saving account have 15%  intrest
    }

    @Override
    public String applyForLoan() {
     return ("loan application is submitted for "+ getHolderName());
    }

    @Override
    public Boolean calculateLoanEligibility() {
        if(getBalance()>45000){
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
        return "****"+ (getAccountNumber().length()-1);
    }
}
