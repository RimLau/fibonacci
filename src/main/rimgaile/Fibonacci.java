package rimgaile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    private static final int MAX_FIBONACCI_INDEX = 94;

    public static void main(String[] args) {
        while (true) {
            try {
                long n = readInputFromTerminal();
                boolean isPositive = isPositive(n);
                if (!isPositive) {
                    printNegativeInputErrorMessage(n);
                    continue;
                }
                boolean isValid = validIndex(n);
                if (isValid) {
                    writeAnswerIntoTerminal(n);
                    break;
                } else {
                    printInvalidIndexErrorMessage(n);
                }
            } catch (InputMismatchException e) {
                printInvalidInputErrorMessage();
            }
        }
    }

    public static long readInputFromTerminal() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter index:");
        return input.nextLong();
    }

    public static boolean validIndex(long n) {
        return n < MAX_FIBONACCI_INDEX;
    }

    public static boolean isPositive(long n) {
        return n > 0;
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

    public static void writeAnswerIntoTerminal(long n) {
        if (n > 2) {
            System.out.println("Fibonacci index " + n + " = " + nSkResult(n));
        } else {
            System.out.println("Fibonacci index " + n + " = 1");
        }
    }


    public static long nSkResult(long n) {
        long num1 = 1;
        long num2 = 1;
        long res = 0;
        long[] list = new long[MAX_FIBONACCI_INDEX];
        list[0] = num1;
        list[1] = num2;

        for (int i = 2; i < n; i++) {
            res = num1 + num2;
            num1 = num2;
            list[i] = res;
            num2 = res;
        }
        for (int i=0; i<n; i++) {
            System.out.println(list[i]);
        }

        return res;
    }
}