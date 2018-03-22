package rimgaile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Exercise 1:");
        System.out.println("Hello, World!\nRimgailė");
        System.out.println("Exercise 2-3:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Enter your second number:");
        int num2 = input.nextInt();
        System.out.println("Enter operator:");
        String operator = input.next();

        int results = 0;
        try {
            results = calculate(num1, num2, operator);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(results);
    }

    public static int calculate(int num1, int num2, String operator) throws Exception {
        int answer;
        if (operator.equals("+")) {
            answer = num1 + num2;
        } else if (operator.equals("-")) {
            answer = num1 - num2;
        } else if (operator.equals("*")) {
            answer = num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                answer = num1 / num2;
            } else {
                throw new IllegalArgumentException("Dalyba iš nulio negalima");
            }
        } else {
            throw new Exception("Wrong operation");
        }

        return answer;
    }
}