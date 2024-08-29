package JAVA;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first integer value:");
        int num1 = scanner.nextInt();

        System.out.println("Please enter the second integer value:");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result = 0;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 == 0 || num1 == 0) {
                System.out.println("Invalid Division by zero");
                return;
            }
            result = (double) num1 / num2;
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("Result: " + result);
    }
}