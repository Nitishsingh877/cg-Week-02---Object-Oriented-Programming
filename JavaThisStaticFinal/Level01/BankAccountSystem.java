public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount("nitish singh",758885236);
        BankAccount cbi = new BankAccount("siddhu singh",6546515);
        BankAccount.setBankName("state bank of india");
        sbi.getDetails();
        cbi.getDetails();


        if(sbi instanceof BankAccount) {
            System.out.println("yes sbi is instance of bank account");
        }

    }
}

class BankAccount {
    private static  int count =0;
    static String bankName = null; //static variable
    private String accountHolderName;
    private final long accountNumber;

    BankAccount(String accountHolderName, long accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber =accountNumber;
        count++;
    }

     public static void setBankName (String updatedBankName){
        bankName = updatedBankName;
    }
    public  static void getTotalAccounts() {
        System.out.println("total number of account is " + count);
    }

    public void getDetails(){
        System.out.println("Account number : "+accountNumber);
        System.out.println("Bank name : "+bankName);
        System.out.println("Account holder name : "+accountHolderName);
    }
}
