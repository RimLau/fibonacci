package rimgaile;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number:");
        int number = input.nextInt();

        System.out.println(sumOfNumber(number));
    }

    public static int sumOfNumber(int number) {
        int sum = 0;
        while (number != 0) {
            sum = number % 10 + sum;
            number = number / 10;
        }
        return sum;
    }
}

