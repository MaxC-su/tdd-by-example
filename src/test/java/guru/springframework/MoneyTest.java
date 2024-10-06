package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    public void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar result = five.times(2);
        assertEquals(new Dollar(10), result);
        result = five.times(3);
        assertEquals(new Dollar(15), result);
        result = five.times(4);
        assertEquals(new Dollar(20), result);
        result = five.times(5);
        assertEquals(new Dollar(25), result);
    }

    @Test
    public void testSubtractionDollar() {
        Dollar five = new Dollar(5);
        Dollar result = five.minus(2);
        assertEquals(3, result.getAmount());
        result = five.minus(1);
        assertEquals(4, result.getAmount());
        result = five.minus(4);
        assertEquals(1, result.getAmount());
    }

    @Test
    public void testAdditionDollar() {
        Dollar five = new Dollar(5);
        Dollar result = five.plus(2);
        assertEquals(new Dollar(7), result);
        result = five.plus(1);
        assertEquals(new Dollar(6), result);
        result = five.plus(4);
        assertEquals(new Dollar(9), result);
    }

    @Test
    public void testDivisionDollar() {
        Dollar five = new Dollar(60);
        Dollar result = five.divide(2);
        assertEquals(30, result.getAmount());
        result = five.divide(3);
        assertEquals(20, result.getAmount());
        result = five.divide(4);
        assertEquals(15, result.getAmount());
        result = five.divide(5);
        assertEquals(12, result.getAmount());
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
        assertNotEquals(new Dollar(5), new Dollar(6));
    }

    @Test
    public void testMultiplicationFrank() {
        Frank five = new Frank(5);
        Frank result = five.times(2);
        assertEquals(new Frank(10), result);
        result = five.times(3);
        assertEquals(new Frank(15), result);
        result = five.times(4);
        assertEquals(new Frank(20), result);
        result = five.times(5);
        assertEquals(new Frank(25), result);
    }

    @Test
    public void testSubtractionFrank() {
        Frank five = new Frank(5);
        Frank result = five.minus(2);
        assertEquals(3, result.getAmount());
        result = five.minus(1);
        assertEquals(4, result.getAmount());
        result = five.minus(4);
        assertEquals(1, result.getAmount());
    }

    @Test
    public void testAdditionFrank() {
        Frank five = new Frank(5);
        Frank result = five.plus(2);
        assertEquals(new Frank(7), result);
        result = five.plus(1);
        assertEquals(new Frank(6), result);
        result = five.plus(4);
        assertEquals(new Frank(9), result);
    }

    @Test
    public void testDivisionFrank() {
        Frank five = new Frank(60);
        Frank result = five.divide(2);
        assertEquals(30, result.getAmount());
        result = five.divide(3);
        assertEquals(20, result.getAmount());
        result = five.divide(4);
        assertEquals(15, result.getAmount());
        result = five.divide(5);
        assertEquals(12, result.getAmount());
    }

    @Test
    void testEqualityFrank() {
        assertEquals(new Frank(5), new Frank(5));
        assertNotEquals(new Frank(5), new Frank(8));
        assertNotEquals(new Frank(5), new Frank(6));
    }

}
