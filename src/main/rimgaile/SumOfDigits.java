package rimgaile;

import java.io.*;

public class SumOfDigits {
    public static void main(String[] args) {
        int value = readFromFile();
        writeIntoConsole(value);
    }

    public static int readFromFile() {
        BufferedReader br;
        int value = 0;
        String line = null;
        try {
            String fileName = "src/main/rimgaile/fileForSumOfDigits.txt";
            br = new BufferedReader(new FileReader(fileName));
          try {
                while ((line = br.readLine()) != null) {
                    value = Integer.parseInt(line);
                }
            }
            catch (NumberFormatException e) {
                printInvalidInputErrorMessage(line);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        return value;
    }

    public static void writeIntoConsole (int value) {
        System.out.println("Number: " + value);
        System.out.println("The sum of the numbers: " + sumOfNumber(value));
    }

    public static int sumOfNumber(int value) {
        int sum = 0;
        while (value != 0) {
            sum = value % 10 + sum;
            value = value / 10;
        }
        return sum;
    }
    public static void printInvalidInputErrorMessage(String line) {
        System.out.println("Invalid number - " + line + ". Try again!");
    }
}

