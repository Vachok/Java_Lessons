package lessons.general.methodexception;

/**
 * Наследуемость {@link Exception}
 * {@link Child}
 *
 * @since 28.07.2018 (19:03)
 */
class Base {
    void methOd() throws Exception {

    }
}

/**
 * Наследник от {@link Base}.
 * <p>
 * Можно выбрасывать {@code uncheked}, если даже нет у родителя.
 * <p>
 * Если {@link Base}, бросет {@link Exception}, тогда его наследники могут бросать {@link Exception}, стоящий ниже по-иерархии.
 * или {@link RuntimeException}. Так же можно ничего не бросать.
 * {@link #methOd()}
 *
 * @see Base
 * @since 28.07.2018 (19:04)
 */
class Child extends Base {
    /**
     * {@link Base#methOd()}
     * Можно: {@code unchecked}, {@link RuntimeException} или всё, что ниже {@link Exception}.
     * Можно совсем ничего.
     */
    @Override
    void methOd() {

    }
}
