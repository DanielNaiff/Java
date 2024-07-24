import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
    // DOWNCASTING

    BusinessAccount acc4 = (BusinessAccount) acc2;
    acc4.loan(100.0);

    //BusinessAccount acc5 = (BusinessAccount) acc3;
    if(acc3 instanceof BusinessAccount){
        BusinessAccount acc5 = (BusinessAccount) acc3;
        acc5.loan(200.0);
        System.out.println("Loan!");
    }
    if( acc3 instanceof SavingAccount){
        SavingAccount acc5 = (SavingAccount) acc3;
        acc5.updateBalance();
        System.out.println("Update!");
    }

    List<Account> list = new ArrayList<>();

    list.add(new SavingAccount(1001, "Alex", 500.00, 0.01));
    list.add(new BusinessAccount(1002,"Maria", 1000.0, 400.0));
    }
}