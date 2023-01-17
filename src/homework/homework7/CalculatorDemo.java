package homework.homework7;

import java.util.concurrent.Callable;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        double result;
        result = myCalculator.plus(432, 567);
        System.out.println("Plus: " + result);
        result = myCalculator.minus(2578, 1320);
        System.out.println("Minus: " + result);
        result = myCalculator.multiply(20, 50);
        System.out.println("Multiply: " + result);
        result = myCalculator.divide(200, 21);
        System.out.println("Divide: " + result);

    }
}
