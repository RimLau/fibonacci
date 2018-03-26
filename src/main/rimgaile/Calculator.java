package rimgaile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = readFirstNum(input);
        int num2 = readSecondNum(input);
        String operator = readOperator(input);

        writeResultIntoConsole(num1, num2, operator);

    }

    public static void writeResultIntoConsole(int num1, int num2, String operator) {
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

    public static int readFirstNum(Scanner input) {
        System.out.println("Enter your first number:");
        int num1 = input.nextInt();

        return num1;
    }

    public static int readSecondNum(Scanner input) {
        System.out.println("Enter your second number:");
        int num2 = input.nextInt();

        return num2;
    }

    public static String readOperator(Scanner input) {
        System.out.println("Enter operator:");
        String operator = input.next();
        return operator;
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