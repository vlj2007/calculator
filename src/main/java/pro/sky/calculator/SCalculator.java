package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class SCalculator implements ICalculator {
    private int num1;
    private int num2;

    @Override
    public String welcome() {
        return "<center><b>" + "Добро пожаловать в калькулятор" + "</center></b>";
    }

    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;

    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;

    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Double divide(Integer num1, Integer num2) {
        if (num2 == 0) throw new IllegalArgumentException("Error null");
        return num1.doubleValue() / num2.doubleValue();
    }
}
