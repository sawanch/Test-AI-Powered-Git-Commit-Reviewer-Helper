import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAverage() {
        Calculator calc = new Calculator();
        assertEquals(30.0, calc.average(10, 20, 30, 40, 50));
        assertThrows(IllegalArgumentException.class, () -> calc.average());
    }

    @Test
    void testFactorial() {
        Calculator calc = new Calculator();
        assertEquals(120, calc.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(21));
    }
}