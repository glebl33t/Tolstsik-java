package by.itacademy.tolstik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void createCalculatorInstance() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("check func sum a + b")
    public void testSum() {
        int actual = calculator.sum(2, 5);
        Assertions.assertEquals(7, actual);
    }

    @Test
    @DisplayName("check func subtract a - b")
    public void testSubtract() {
        int actual = calculator.subtract(5, 2);
        Assertions.assertEquals(3, actual);
    }

    @Test
    @DisplayName("check func multiply a * b")
    public void testMultiply() {
        int actual = calculator.multiply(2, 5);
        Assertions.assertEquals(10, actual);
    }

    @Test
    @DisplayName("check func divide a / b")
    public void testDivide() {
        double actual = calculator.divide(10, 5);
        Assertions.assertEquals(2, actual);
    }

}
