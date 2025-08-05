package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter your name: ");
        employee.name = sc.nextLine();
        System.out.print("Enter your gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Enter your tax: ");
        employee.tax = sc.nextDouble();

        System.out.print("Employee: " + employee);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);


        sc.close();
    }

}
