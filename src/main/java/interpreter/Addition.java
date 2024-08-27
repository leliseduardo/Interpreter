package interpreter;

public class Addition implements ExpressionInterpreter {

    private double x;
    private double y;

    public Addition(Number leftElement, Number rightElement) {
        x = leftElement.getNumber();
        y = rightElement.getNumber();
    }

    public double interpret() {
        return x + y;
    }
}
