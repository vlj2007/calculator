package pro.sky.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SCalculatorTest {
    private final ICalculator iCalculator = new SCalculator();


    @Test
    public void getWelcome() {
        String expected = "<center><b>" + "Добро пожаловать в калькулятор" + "</center></b>";
        assertEquals(expected, iCalculator.welcome());
    }

    @Test
    public void getPlusNumbers() {
        Integer expected = 10;
        assertEquals(expected, iCalculator.plus(5, 5));
    }

    @Test
    public void getMinusNumbers() {
        Integer expected = 0;
        assertEquals(expected, iCalculator.minus(5, 5));
    }

    @Test
    public void getMultiplyNumbers() {
        Integer expected = 25;
        assertEquals(expected, iCalculator.multiply(5, 5));
    }

    @Test
    public void getDivideNumbersPositive() {
        Double expected = 1.0;
        assertEquals(expected, iCalculator.divide(5, 5));
    }

    @Test
    public void getDivideNumbersNegative() {
        assertThrows(IllegalArgumentException.class, () -> iCalculator.divide(Integer.MAX_VALUE, 0));
    }

    @Test
    public void getDivideNumbersNull() {
        assertThrows(NullPointerException.class, () -> iCalculator.divide(Integer.MAX_VALUE, null));
    }


}
