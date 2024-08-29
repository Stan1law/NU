package JAVA;

import java.util.Scanner;

public class Lab_Exercise2 {

    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static float Division(float num1, float num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int operator = scanner.nextInt();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        if (operator == 1) {
            System.out.println(Addition(num1, num2));
        } else if (operator == 2) {
            System.out.println(Subtraction(num1, num2));
        } else if (operator == 3) {
            System.out.println(Multiply(num1, num2));
        } else if (operator == 4) {
            System.out.println(Division(num1, num2));
        }
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
        }

    }
}
