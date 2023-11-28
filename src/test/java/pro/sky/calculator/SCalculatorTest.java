package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SCalculatorTest {
    private final ICalculator iCalculator = new SCalculator();


    @Test
    public void getWelcome() {
        String expected = "<center><b>" + "Добро пожаловать в калькулятор" + "</center></b>";
        assertEquals(expected, iCalculator.welcome());
    }


    @ParameterizedTest
    @CsvSource(value = {"5,5,10", "-8,4,-4"})
    public void getPlusNumbers(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, iCalculator.plus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource(value = {"5,5,0", "-8,4,-12"})
    public void getMinusNumbers(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, iCalculator.minus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource(value = {"5,5,25", "-8,4,-32"})
    public void getMultiplyNumbers(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, iCalculator.multiply(num1, num2));
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
