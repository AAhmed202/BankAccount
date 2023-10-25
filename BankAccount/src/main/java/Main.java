import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BankAccount> accounts = new ArrayList<>();

        CurrentAccount acc1 = new CurrentAccount(1000,100, "Azan");
        CurrentAccount acc2 = new CurrentAccount(5000,200, "Elena");

        accounts.add(acc1);
        accounts.add(acc2);

        for (BankAccount account : accounts){
            System.out.println(account);
        }

    }
}
