package chapter3.ModifiedAccount;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jame Green", 50.00);
        Account account2 = new Account("John  Blue", 7.50);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdraw amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%n Subtracting %.2f from account1 balance .....%n %n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        // display balances
        System.out.printf("%s balance:$%.2f%n", account1.getName(), account1.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        withdrawAmount = input.nextDouble();
        System.out.printf("%n Subtract %.2f from account2 balance.....%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount);


        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
    }
}
