import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testPower() {
        Calculator calc = new Calculator();
        double result = calc.power(2, 3);
        assertEquals(8.0, result);
    }

    @Test
    public void testPowerWithNegativeExponent() {
        Calculator calc = new Calculator();
        double result = calc.power(2, -3);
        assertEquals(0.125, result);
    }
}