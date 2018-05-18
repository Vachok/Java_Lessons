package pattern.interpreter;

/**
 * Интерфейс для интерпретатора.
 *
 * @since 06.05.2018 (11:11)
 */
interface Expression {
    /**
     * @param context контекст (выражение)
     */
    int interpret(Expression context);
}
