package pattern.interpreter;

/**
 * Класс "отвечает" за цифры.
 *
 * @see Minus
 * @see Plus
 * @since 06.05.2018 (11:15)
 */
class Number implements Expression {
    public Number(int number) {
        this.number = number;
    }

    int number;

    @Override
    public int interpret(Expression context) {
        return number;
    }
}

