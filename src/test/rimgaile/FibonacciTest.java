package rimgaile;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void isPositive () {
        Assert.assertEquals(true, Fibonacci.isPositive(1));
    }

    @Test
    public void isNegative () {
        Assert.assertEquals(false, Fibonacci.isPositive(-5));
    }
    @Test
    public void isZero () {
        Assert.assertEquals(false, Fibonacci.isPositive(0));
    }

    @Test
    public void indexIsValid () {
        Assert.assertEquals(true, Fibonacci.validIndex(3));
    }

    @Test
    public void indexInvalid () {
        Assert.assertEquals(false, Fibonacci.validIndex(95));
    }
    @Test
    public void indexIsEdge () {
        Assert.assertEquals(false, Fibonacci.validIndex(94));
    }
}
