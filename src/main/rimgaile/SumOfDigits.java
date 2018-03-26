package rimgaile;

import java.io.*;

public class SumOfDigits {
    public static void main(String[] args) {
        int value = readFromFile();
        writeIntoConsole(value);

    }

    public static int readFromFile() {
        BufferedReader br = null;
        int value = 0;
        String line;
        try {
            String fileName = "src/main/rimgaile/fileForSumOfDigits.txt";
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                value = Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return value;
    }

    public static void writeIntoConsole (int value) {
        System.out.println("lala: " + value);
        System.out.println(sumOfNumber(value));
    }
    public static int sumOfNumber(int value) {
        int sum = 0;
        while (value != 0) {
            sum = value % 10 + sum;
            value = value / 10;
        }
        return sum;
    }
}

