package pattern.interpreter;

import java.util.Stack;

/**
 * Класс, который будет считать.
 *
 * @see InterpreterMain
 * @since 06.05.2018 (11:23)
 */
class Evaluate implements Expression {
    /**
     * "Верхнее" выражение
     *
     * @see Minus#interpret(Expression)
     */
    Expression evaluate;

    /**
     * Нужен {@link java.util.Stack}, где будут храниться
     * {@link Expression}. И надо написать логику. Например.
     * {@link Plus}, {@link Minus} и {@link Number}, загоняет в
     * {@link Stack}.
     *
     * @param expression само выражение.
     * @see InterpreterMain
     */
    public Evaluate(String expression) {
        Stack<Expression> expressions = new Stack<>();
        String expressionRevert = new StringBuffer(expression).reverse().toString();
        for (String s : expression.split("\\D")) {
            expressions.push(new Number(Integer.parseInt(s)));
        }
        for (String s : expression.split("\\d")) {
            if (s.equals("+")) expressions.push(new Plus(expressions.pop(), expressions.pop()));
            else if (s.equals("-")) expressions.push(new Minus(expressions.pop(), expressions.pop()));
        }
        evaluate = expressions.pop();
    }

    @Override
    public int interpret(Expression context) {
        return evaluate.interpret(context);
    }
}
