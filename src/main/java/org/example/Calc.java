package org.example;

public class Calc {

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public double divide(double number1, double number2) throws Exception {
        if (number2 == 0) {
            throw new Exception("Нельзя делить на ноль");
        }
        return number1 / number2;
    }
}
