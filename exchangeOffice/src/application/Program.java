package application;

import java.util.Locale;
import java.util.Scanner;

import util.currencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double result = currencyConverter.dollarToReal(amount, dollarPrice);
        System.out.print("Amount to be paid in reais = " + String.format("%.2f", result));

    }
}
