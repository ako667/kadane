package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KadaneTest {

    @Test
    void testEmptyArray() {
        Kadane.Result result = Kadane.maxSubarraySum(new int[]{});
        assertEquals(0, result.maxSum);
        assertEquals(-1, result.start);
        assertEquals(-1, result.end);
    }

    @Test
    void testSingleElement() {
        Kadane.Result result = Kadane.maxSubarraySum(new int[]{5});
        assertEquals(5, result.maxSum);
        assertEquals(0, result.start);
        assertEquals(0, result.end);
    }

    @Test
    void testAllNegative() {
        Kadane.Result result = Kadane.maxSubarraySum(new int[]{-3, -5, -2, -8});
        assertEquals(-2, result.maxSum);
        assertEquals(2, result.start);
        assertEquals(2, result.end);
    }

    @Test
    void testMixedValues() {
        Kadane.Result result = Kadane.maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(6, result.maxSum);
        assertEquals(3, result.start);
        assertEquals(6, result.end);
    }

    @Test
    void testAllPositive() {
        Kadane.Result result = Kadane.maxSubarraySum(new int[]{1, 2, 3, 4});
        assertEquals(10, result.maxSum);
        assertEquals(0, result.start);
        assertEquals(3, result.end);
    }
}
