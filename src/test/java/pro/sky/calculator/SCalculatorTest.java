package pro.sky.calculator;

import org.junit.jupiter.api.Test;

public class SCalculatorTest {
    @Test
    public void getPlusNumbers() {
        int num1 = 2;
        int num2 = 6;
        SCalculator sCalculator = new SCalculator();
        sCalculator.plus(num1, num2);
    }

    @Test
    public void getMinusNumbers() {
        int num1 = 2;
        int num2 = 6;
        SCalculator sCalculator = new SCalculator();
        sCalculator.minus(num1, num2);
    }

    @Test
    public void getMultiplyNumbers() {
        int num1 = 2;
        int num2 = 6;
        SCalculator sCalculator = new SCalculator();
        sCalculator.multiply(num1, num2);
    }

    @Test
    public void getDivideNumbers() {
        int num1 = 2;
        int num2 = 6;
        SCalculator sCalculator = new SCalculator();
        sCalculator.divide(num1, num2);
    }




}
