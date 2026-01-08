import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testModulus() {
        Calculator calc = new Calculator();
        assertEquals(2.0, calc.modulus(17, 5));
        assertThrows(ArithmeticException.class, () -> calc.modulus(17, 0));
    }

    @Test
    public void testAbsolute() {
        Calculator calc = new Calculator();
        assertEquals(42.5, calc.absolute(-42.5));
        assertEquals(0.0, calc.absolute(0.0));
        assertEquals(42.5, calc.absolute(42.5));
    }
}