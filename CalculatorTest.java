import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testRunMethod() {
        String expression = "2+3*4-5/2";
        String expected = "11.5";

        String result = Calculator.Run(expression);

        assertEquals(expected, result);
    }
}
