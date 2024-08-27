package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionInterpreterTest {

    @Test
    void shouldCalculateAdditionExpression() {
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("10 + 10");
        assertEquals(20.0, interpreter.interpret());
    }

    @Test
    void shouldCalculateSubtractionExpression() {
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("10 - 10");
        assertEquals(0.0, interpreter.interpret());
    }

    @Test
    void shouldCalculateMultiplicationExpression() {
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("10 * 10");
        assertEquals(100.0, interpreter.interpret());
    }

    @Test
    void shouldCalculateDivisionExpression() {
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("10 / 10");
        assertEquals(1.0, interpreter.interpret());
    }

    @Test
    void shouldCalculateCombinedExpression() {
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("10 / 2 * 3 + 1 - 4");
        assertEquals(12.0, interpreter.interpret());
    }

    @Test
    void shouldReturnInvalidElementException() {
        try {
            ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("2 ^ 2");
            assertEquals(4.0, interpreter.interpret());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Expression contains invalid element", e.getMessage());
        }
    }

    @Test
    void shouldReturnInvalidExpressionException() {
        try {
            ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("2 +");
            assertEquals(4.0, interpreter.interpret());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid expression", e.getMessage());
        }
    }
}
