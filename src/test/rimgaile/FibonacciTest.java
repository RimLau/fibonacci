package rimgaile;

import org.junit.Assert;
import org.junit.Test;

import static rimgaile.Fibonacci.MAX_FIBONACCI_INDEX;

public class FibonacciTest {
    @Test
    public void isPositive () {
        Assert.assertTrue(Fibonacci.isPositive(1));
    }

    @Test
    public void isNegative () {
        Assert.assertFalse(Fibonacci.isPositive(-5));
    }
    @Test
    public void isZero () {
        Assert.assertFalse(Fibonacci.isPositive(0));
    }

    @Test
    public void indexIsValid () {
        Assert.assertTrue(Fibonacci.validIndex(3));
    }

    @Test
    public void indexInvalid () {
        Assert.assertFalse(Fibonacci.validIndex(95));
    }

    @Test
    public void indexIsMaxEdge () {
        Assert.assertFalse(Fibonacci.validIndex(94));
    }

    @Test
    public void fibonacciThirdIndex () {
        long[] list = new long[MAX_FIBONACCI_INDEX];
        Assert.assertEquals(2, Fibonacci.nSkResult(3, list));
    }

    @Test
    public void fibonacciZero () {
        long[] list = new long[MAX_FIBONACCI_INDEX];
        Assert.assertEquals(0, Fibonacci.nSkResult(0, list));
    }
}