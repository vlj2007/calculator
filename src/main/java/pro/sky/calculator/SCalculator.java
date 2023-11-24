package pro.sky.calculator;
import pro.sky.calculator.ICalculator;

import org.springframework.stereotype.Service;

@Service
public class SCalculator implements ICalculator {
    private int num1;
    private int num2;

    @Override
    public String plus(int num1, int num2) {
//        int num1 = Integer.parseInt(String.valueOf(values[0]));
//        int num2 = Integer.parseInt(String.valueOf(values[1]));
        int Result = num1 + num2;
        return "<center><b>" + num1 + " + " + num2 + " =  " + Result + "</center></b>";
    }
    @Override
    public String minus(int num1, int num2){
        int Result = num1 - num2;
        return "<center><b>" + num1 + " - " + num2 + " =  " + Result + "</center></b>";
    }
    @Override
    public String multiply(int num1, int num2){
        int Result = num1 * num2;
        return "<center><b>" + num1 + " * " + num2 + " =  " + Result + "</center></b>";
    }
    @Override
    public String divide(int num1, int num2) throws IllegalArgumentException{
        if (num2 == 0) {
            throw new IllegalArgumentException("Error null");
        } else {
            return "<center><b>" + num1 + " / " + num2 + " = " + (float) (num1 / num2) + "</center></b>";
        }
    }

}
