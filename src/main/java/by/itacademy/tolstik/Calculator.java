package by.itacademy.tolstik;

import java.util.function.BiFunction;

public class Calculator implements ICalculator {

    @Override
    public int sum(int a, int b) {
        BiFunction<Integer, Integer, Integer> sumFunc = (x, y) -> {
            try {
                return Math.addExact(x, y);
            } catch (ArithmeticException e) {
                return 0;
            }
        };
        return sumFunc.apply(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        BiFunction<Integer, Integer, Integer> subtractFunc = (x, y) -> {
            try {
                return Math.subtractExact(a, b);
            } catch (Exception e) {
                return 0;
            }
        };
        return subtractFunc.apply(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        BiFunction<Integer, Integer, Integer> multiplyFunc = (x, y) -> {
            try {
                return Math.multiplyExact(a, b);
            } catch (Exception e) {
            }
            return 0;
        };
        return multiplyFunc.apply(a, b);
    }

    @Override
    public double divide(int a, int b) {
        BiFunction<Integer, Integer, Double> divideFunc = (x, y) -> {
            if (b == 0) {
                return (double) 0;
            }
            return (double) a / b;
        };
        return divideFunc.apply(a, b);
    }
}
