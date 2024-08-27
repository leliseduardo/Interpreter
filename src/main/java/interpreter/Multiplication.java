package interpreter;

public class Multiplication implements ExpressionInterpreter {

    private double x;
    private double y;

    public Multiplication(Number leftElement, Number rightElement) {
        x = leftElement.getNumber();
        y = rightElement.getNumber();
    }

    public double interpret() {
        return x * y;
    }
}
