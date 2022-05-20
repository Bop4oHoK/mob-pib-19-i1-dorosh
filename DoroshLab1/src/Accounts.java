import java.util.ArrayList;

public class Accounts {


    public static ArrayList getAccounts() {
        Account checkingAccount = new Account( 51, 'a', 10000.0);
        Account cashBox = new Account(50, 'p', 10000.0);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(checkingAccount);
        accounts.add(cashBox);
        return accounts;
    }

}
