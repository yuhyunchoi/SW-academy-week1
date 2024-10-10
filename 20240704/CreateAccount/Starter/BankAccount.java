import java.math.*;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    public long accountNumber(){
        return this.accountNumber;
    }
    public String ownerName(){
        return this.ownerName;
    }
    public BigDecimal balance(){
        return this.balance;
    }

    public void SetData(long accountNumber, String ownerName, BigDecimal balnace){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balnace;
    }



}

class CreateAccount {
    public static BankAccount createNewBankAccount(int accountNumber, String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        
        //newAccount.accountNumber = accountNumber;
        //newAccount.ownerName = ownerName;
        //newAccount.balance = balance;
        
        newAccount.SetData(accountNumber, ownerName, balance);

        return newAccount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = CreateAccount.createNewBankAccount(1, "Vesper Lind", new BigDecimal("0.0"));
        printBankAccount(bankAccount);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.accountNumber());
        System.out.println("Owner Name: " + account.ownerName());
        System.out.println("Balance: " + account.balance());
    }
}