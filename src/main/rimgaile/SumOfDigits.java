package rimgaile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SumOfDigits {
    private static final String FILE_NAME = "src/main/rimgaile/fileForSumOfDigits.txt";

    public static void main(String[] args) {
        List<Integer> listOfValues = readFromFile();
        for (Integer value : listOfValues) {
            writeIntoConsole(value);
        }
    }

    private static List<Integer> readFromFile() {
        BufferedReader br;
        String line;
        List<Integer> listOfValues = new ArrayList<Integer>();
        try {
            br = new BufferedReader(new FileReader(FILE_NAME));
            while ((line = br.readLine()) != null) {
                listOfValues.add(tryParseInt(line));
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return listOfValues;
    }

    private static int tryParseInt(String line) {
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            printInvalidInputErrorMessage(line);
            return 0;
        }
    }

    private static void writeIntoConsole(int value) {
        System.out.println("Number: " + value);
        System.out.println("The sum of the numbers: " + sumOfNumber(value));
    }

    static int sumOfNumber(int value) {
        int sum = 0;
        while (value != 0) {
            sum = value % 10 + sum;
            value = value / 10;
        }
        return sum;
    }

    private static void printInvalidInputErrorMessage(String line) {
        System.out.println("Invalid number - " + line + ". Try again!");
    }
}

