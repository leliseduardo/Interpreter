package interpreter;

public class Subtraction implements ExpressionInterpreter {
    private double x;
    private double y;

    public Subtraction(Number leftElement, Number rightElement) {
        x = leftElement.getNumber();
        y = rightElement.getNumber();
    }

    public double interpret() {
        return x - y;
    }
}
