package pro.sky.calculator;

public interface ICalculator {
    String welcome();
    Integer plus(Integer num1, Integer num2);
    Integer minus(Integer num1, Integer num2);
    Integer multiply(Integer num1, Integer num2);
    Double divide(Integer num1, Integer num2);
}
