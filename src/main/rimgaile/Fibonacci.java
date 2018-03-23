package rimgaile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    static final int MAX_FIBONACCI_INDEX = 93;

    public static void main(String[] args) {
        long[] list = new long[MAX_FIBONACCI_INDEX];

        long n = getValidFibonacciIndex();
        writeAnswerIntoTerminal(n, list);
        arrayOfFibonacci(n, list);
    }

    public static long getValidFibonacciIndex() {
        long n;
        while (true) {
            try {
                n = readInputFromTerminal();
                if (!isPositive(n)) {
                    printNegativeInputErrorMessage(n);
                    continue;
                }

                if (!validIndex(n)) {
                    printInvalidIndexErrorMessage(n);
                    continue;
                }
            } catch (InputMismatchException e) {
                printInvalidInputErrorMessage();
                continue;
            }
            return n;
        }
    }

    public static long readInputFromTerminal() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter index:");
        return input.nextLong();
    }

    public static boolean isPositive(long n) {
        return n > 0;
    }

    public static boolean validIndex(long n) {
        return n < MAX_FIBONACCI_INDEX;
    }

    public static void writeAnswerIntoTerminal(long n, long[] list) {
        if (n > 2) {
            System.out.println("Fibonacci index " + n + " = " + nSkResult(n, list));
        } else {
            System.out.println("Fibonacci index " + n + " = 1");
        }

    }


    public static long nSkResult(long n, long[] list) {
        long num1 = 1;
        long num2 = 1;
        long res = 0;

        for (int i = 2; i < n; i++) {
            res = num1 + num2;
            num1 = num2;
            list[i] = res;
            num2 = res;
        }

        return res;
    }

    public static void arrayOfFibonacci(long n, long[] list) {
        list[0] = list[1] = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print((list[i]) + " ");
        }
    }

    public static void printInvalidIndexErrorMessage(long n) {
        System.out.println("System is not able to calculate your index " + n + ". " +
                "Please enter less than the maximum " + MAX_FIBONACCI_INDEX + " index.");
    }

    public static void printInvalidInputErrorMessage() {
        System.out.println("Invalid number or it's too long. Try again!");
    }

    public static void printNegativeInputErrorMessage(long n) {
        System.out.println("Fibonacci didn't have " + n + " index. Try again!");
    }
}