package interpreter;

public class Number implements ExpressionInterpreter {

    private double number;

    public Number(double number) {
        this.number = number;
    }

    public double interpret() {
        return number;
    }

    public double getNumber() {
        return this.number;
    }
}
