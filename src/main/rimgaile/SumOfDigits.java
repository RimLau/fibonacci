package rimgaile;

import java.io.*;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter integer number:");
        //int number = input.nextInt();
        //System.out.println(sumOfNumber(number));

file();
    }

    public static String file() {
        BufferedReader br = null;
        String line = null;
        try {
            String fileName = "C:\\Users\\RimgaileLauzadyte\\Documents\\personalProjects\\fibonacci\\src\\main\\rimgaile\\fileForSumOfDigits.txt";
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
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
        return line;
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

