package by.itacademy.tolstik;

public class Calculator implements ICalculator {

    @Override
    public int sum(int a, int b) {
        try {
            return Math.addExact(a, b);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int subtract(int a, int b) {
        try {
            return Math.subtractExact(a, b);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int multiply(int a, int b) {
        try {
            return Math.multiplyExact(a, b);
        } catch (Exception e) {
        }
        return 0;
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (double) a / b;
    }
}
