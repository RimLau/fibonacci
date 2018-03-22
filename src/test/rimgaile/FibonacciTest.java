package rimgaile;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals(2, Fibonacci.nSkResult(3));
    }

    @Test
    public void fibonacciZero () {
        Assert.assertEquals(0, Fibonacci.nSkResult(0));
    }
}