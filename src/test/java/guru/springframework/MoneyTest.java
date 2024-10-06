package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @Test
    public void testSubtraction() {
        Dollar five = new Dollar(5);
        five.minus(2);
        assertEquals(3, five.amount);
    }

    @Test
    public void testAddition() {
        Dollar five = new Dollar(5);
        five.plus(2);
        assertEquals(7, five.amount);
    }

    @Test
    public void testDivision() {
        Dollar five = new Dollar(10);
        five.divide(2);
        assertEquals(5, five.amount);
    }

}
