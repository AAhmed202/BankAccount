public class CurrentAccount extends BankAccount{

    private double maxWithdrawAmount;

    public CurrentAccount(double balance, double minimumBal, String accountHolderName) {
        super(balance, minimumBal, accountHolderName);
    }

    @Override
    public double withdraw(double amount){
        double bal = getBalance();

        if (amount < maxWithdrawAmount){
            bal -= amount;
        }
        else {
            System.out.println("Max Withdraw Limit Hit");
        }
        return bal;
    }


}
