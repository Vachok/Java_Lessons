package pattern.interpreter;

/**
 * Класс отвечает за символ "-"
 * Класс содержит ошибку. Выражение складывается.
 *
 * @see InterpreterMain
 * @see Evaluate
 * @since 06.05.2018 (11:18)
 */
class Minus extends Plus {
    public Minus(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight);
    }

    /**
     * Первый шаг от {@link Evaluate#evaluate}
     *
     * @param context выражение.
     * @return вычитает.
     * @see Plus#interpret(Expression)
     */
    @Override
    public int interpret(Expression context) {
        return expressionLeft.interpret(context) - expressionRight.interpret(context);
    }
}
