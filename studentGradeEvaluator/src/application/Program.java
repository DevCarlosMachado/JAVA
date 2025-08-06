package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();
        System.out.print("Enter the first grade: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Enter the second grade: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Enter the third grade: ");
        student.grade3 = sc.nextDouble();
        System.out.println();

        System.out.println(student);


    }
}
