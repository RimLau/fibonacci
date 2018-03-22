package rimgaile;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void sum() throws Exception {
        Calculator calculator = new Calculator();
        int num1 = 5;
        int num2 = 5;
        String operator = "+";
        assertEquals(10, calculator.calculate(num1, num2, operator));
    }

    @Test
    public void minus() throws Exception {
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 5;
        String operator = "-";
        assertEquals(5, calculator.calculate(num1, num2, operator));
    }

    @Test
    public void multiplication() throws Exception {
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 9;
        String operator = "*";
        assertEquals(90, calculator.calculate(num1, num2, operator));
    }

    @Test
    public void divide() throws Exception {
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 2;
        String operator = "/";
        assertEquals(5, calculator.calculate(num1, num2, operator));

    }

    @Test(expected = IllegalArgumentException.class)
    public void divideFrom0() throws Exception {
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 0;
        String operator = "/";
        assertEquals(0, calculator.calculate(num1, num2, operator));
    }

    @Test(expected = Exception.class)
    public void errorOperator() throws Exception {
        Calculator calculator = new Calculator();
        int num1 = 5;
        int num2 = 2;
        String operator = "#";
        assertEquals(0, calculator.calculate(num1, num2, operator));
    }

}