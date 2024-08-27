package interpreter;

public class Game {

    public static String formula = "gameScore1 + gameScore2 + gameScore3 / 3";

    public static double calculateTotalScore(double gameScore1, double gameScore2, double gameScore3) {
        String expression;
        expression = formula.replace("gameScore1", Double.toString(gameScore1));
        expression = expression.replace("gameScore2", Double.toString(gameScore2));
        expression = expression.replace("gameScore3", Double.toString(gameScore3));
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter(expression);
        return interpreter.interpret();
    }
}
