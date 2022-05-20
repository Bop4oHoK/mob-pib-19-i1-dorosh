import java.util.ArrayList;
import java.util.List;

public class Transactions {

    public ArrayList<Account> transaction(char operation1, int account1, char operation2, int account2, double money, ArrayList<Account> accounts) {
        switch (account1) {
            case 50:
                accounts.set(1, activeAccountTransaction(operation1, money, accounts.get(1)));
                break;
            case 51:
                accounts.set(1, passiveAccountTransaction(operation1, money, accounts.get(0)));
                break;
            default:
                break;
        }
        switch (account2) {
            case 50:
                accounts.set(0, activeAccountTransaction(operation2, money, accounts.get(1)));
                break;
            case 51:
                accounts.set(0, passiveAccountTransaction(operation2, money, accounts.get(0)));
                break;
            default:
                break;
        }
        return accounts;
    }


    public Account activeAccountTransaction(char operation1, double money, Account account) {
        switch (operation1) {
            case 'D':
                account.setMoney(money + account.getMoney());
                break;
            case 'K':
                account.setMoney(account.getMoney() - money );
                break;
            default:
                break;
        }
        return account;
    }


    public Account passiveAccountTransaction(char operation2, double money, Account account) {
        switch (operation2) {
            case 'D':
                account.setMoney(account.getMoney() - money);
                break;
            case 'K':
                account.setMoney(account.getMoney() + money );
                break;
            default:
                break;
        }
        return account;
    }


}
