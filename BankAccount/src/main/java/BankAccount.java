public class BankAccount {
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;
    private double minimumBal;
    private String accountHolderName;


    public BankAccount(double balance, double minimumBal, String accountHolderName) {
        this.balance = balance;
        this.minimumBal = minimumBal;
        this.accountHolderName = accountHolderName;
    }

    public double deposit (double amount){
        balance += amount;
        return balance;
    }

    public double withdraw (double amount){
        balance -= amount;
        return balance;
    }

    @Override
    public String toString(){
        return ("Account Holder Name: " + accountHolderName +  "  Balance: " + balance);
    }


}
