package pattern.interpreter;

/**
 * <b>Основной класс</b>
 * <p>
 * С помощью этого паттерна, можно написать свой парсер, компилятор, etc.
 * Начнём с создания интерфейса. {@link Expression}
 * <p>
 * Любое выражение разбивается на {@link Expression#interpret(Expression)}.
 * "+" - это expression, "-" - expression, цифры тоже.
 * <p>
 * За каждый expression (context), отвечает свой класс.
 *
 * @author 14350
 * @see Number
 * @since 06.05.2018 (11:06)
 */
public class InterpreterMain {
    /**
     * <code>evaluator</code>, запустит сам себя.
     * Далее запустить {@link Plus}, {@link Minus} ...
     *
     * @param args null
     * @see Evaluate
     */
    public static void main(String[] args) {
        String expressiOn = "1+2+3-4";
        Expression evaluator = new Evaluate(expressiOn);
        System.out.println("evaluator = " + evaluator.interpret(evaluator));
    }
}

