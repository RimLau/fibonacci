package rimgaile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = readNumber(input, "Enter Your first number");
        int num2 = readNumber(input, "Enter your second number");
        String operator = readString(input, "Enter operator:");
        System.out.println("Result: " + getResult(num1, num2, operator));
    }

    public static int getResult(int num1, int num2, String operator) {
        int result = 0;
        try {
            result = calculate(num1, num2, operator);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static int readNumber(Scanner input, String text) {
        System.out.println(text);
        return input.nextInt();
    }

    public static String readString(Scanner input, String text) {
        System.out.println(text);
        return input.next();
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