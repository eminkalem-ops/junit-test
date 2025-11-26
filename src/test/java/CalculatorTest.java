import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
	@Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    void testMultiplication() {
        int result = 4 * 5;
        assertEquals(20, result);
    }
}
