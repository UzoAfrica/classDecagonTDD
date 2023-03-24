package calculatorAddition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void add10Plus5() {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(10, 5, "+");
        assertEquals(15, result);
    }

    @Test
    public void add10Plus10() {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(10, 10, "+");
        assertEquals(20, result);
    }
    @Test
    public void subtraction4Minus5() {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(4, 5, "-");
        assertEquals(-1, result);
    }
    @Test
    public void multiplication10x2() {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(10, 2, "*");
        assertEquals(20, result);
    }

    @Test
    public void multiplication1x6() {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(1, 6, "*");
        assertEquals(6, result);
    }
}
