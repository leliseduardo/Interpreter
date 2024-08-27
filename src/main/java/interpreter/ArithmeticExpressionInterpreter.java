package interpreter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ArithmeticExpressionInterpreter implements ExpressionInterpreter {
    private ExpressionInterpreter initialInterpreter;

    public ArithmeticExpressionInterpreter(String context) {

        Stack<ExpressionInterpreter> interpreterStack = new Stack<>();
        List<String> elements = Arrays.asList(context.split(" "));
        Iterator<String> iterator = elements.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.matches("\\d+(\\.\\d*)?")) {
                interpreterStack.push(new Number(Double.parseDouble(element)));
            } else if (element.equals("+")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Invalid expression");
                Number leftElement = (Number) interpreterStack.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Addition interpreter = new Addition(leftElement, rightElement);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else if (element.equals("-")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Invalid expression");
                Number leftElement = (Number) interpreterStack.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Subtraction interpreter = new Subtraction(leftElement, rightElement);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else if (element.equals("*")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Invalid expression");
                Number leftElement = (Number) interpreterStack.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Multiplication interpreter = new Multiplication(leftElement, rightElement);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else if (element.equals("/")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Invalid expression");
                Number leftElement = (Number) interpreterStack.pop();
                Number rightElement = new Number(Double.parseDouble(iterator.next()));
                Division interpreter = new Division(leftElement, rightElement);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else {
                throw new IllegalArgumentException("Expression contains invalid element");
            }
        }
        initialInterpreter = interpreterStack.pop();
    }

    public double interpret() {
        return initialInterpreter.interpret();
    }
}
