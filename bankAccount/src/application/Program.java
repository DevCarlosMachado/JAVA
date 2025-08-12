/*
    This program simulates a simple bank account management system.
    It allows users to create an account, make deposits, and withdraw funds.
    The program interacts with the user through console input and output.
*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account; // Declare the account variable
        System.out.print("Enter account number: ");
        int number = sc.nextInt(); // Read the account number
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine(); // Consume the newline character
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().toLowerCase().charAt(0); // Read the response

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble(); // Read the initial deposit value
            account = new Account(number, holder, initialDeposit); // Create account with initial deposit
        } else {
            account = new Account(number, holder); // Create account without initial deposit
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble(); // Read the deposit value
        account.deposit(depositValue); // Deposit the value into the account
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble(); // Read the Withdraw value
        account.withdraw(withdrawValue); // Withdraw the value from the account
        System.out.println("Update account data: ");
        System.out.println(account);

        sc.close();
    }
}
