package interpreter;

public class Division implements ExpressionInterpreter {

    private double x;
    private double y;

    public Division(Number leftElement, Number rightElement) {
        x = leftElement.getNumber();
        y = rightElement.getNumber();
    }

    public double interpret() {
        return x / y;
    }
}
