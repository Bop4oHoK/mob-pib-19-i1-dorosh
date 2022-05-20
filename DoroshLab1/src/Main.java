import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String args[]) {
        Transactions transactions = new Transactions();
        ArrayList<Account> accounts = Accounts.getAccounts();
        Scanner in = new Scanner(System.in);
        boolean work = true;
        while(work) {
            System.out.println("write operation for operation, and exit for exit");
            String button = in.next();
            switch (button) {
                case "exit": work = false; break;
                case "operation":
                    insertOperation(accounts, transactions, in);
                    for(Account account : accounts) {
                        System.out.println(account.number + " " + account.money);
                    }
                    break;
                default: break;
            }
        }



    }

    public static void insertOperation(ArrayList<Account> accounts, Transactions transactions, Scanner in) {
        String operation1 = in.next();
        int account1 = parseInt(in.next());
        String operation2 = in.next();
        int account2 = parseInt(in.next());
        double money = Double.parseDouble(in.next());
        System.out.println(operation1 + account1 + operation2 + account2 + " " + money);
        accounts = transactions.transaction(operation1.charAt(0), account1, operation2.charAt(0), account2, money, accounts);
    }
}
