package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {
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
    public void testSubtraction() {
        Dollar five = new Dollar(5);
        Dollar result = five.minus(2);
        assertEquals(3, result.getAmount());
        result = five.minus(1);
        assertEquals(4, result.getAmount());
        result = five.minus(4);
        assertEquals(1, result.getAmount());
    }

    @Test
    public void testAddition() {
        Dollar five = new Dollar(5);
        Dollar result = five.plus(2);
        assertEquals(new Dollar(7), result);
        result = five.plus(1);
        assertEquals(new Dollar(6), result);
        result = five.plus(4);
        assertEquals(new Dollar(9), result);
    }

    @Test
    public void testDivision() {
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
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
        assertNotEquals(new Dollar(5), new Dollar(6));
    }

}
