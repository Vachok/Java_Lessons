package pattern.interpreter;

import java.util.Stack;

/**
 * Класс отвечает за символ "+"
 *
 * @see InterpreterMain
 * @since 06.05.2018 (11:18)
 */
class Plus implements Expression {
    /**
     * Это то, что будет слева от "+"
     */
    Expression expressionLeft;

    public Plus(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    /**
     * Это то, что будет справа от "+"
     */
    Expression expressionRight;

    /**
     * Второй шаг {@link Evaluate#evaluate}
     *
     * @param context контекст (выражение)
     * @return складывает.
     */
    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context) + expressionRight.interpret(context);
    }
}

