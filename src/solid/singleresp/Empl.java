package solid.singleresp;

/**
 * На примере сотрудника.
 * <p>
 * Тут может быть куча причин для изменения. Сменилась ЗП
 * Так делать нехорошо.
 * , сменилась рецептура, и тп
 *
 * @since 01.06.2018 (11:53)
 * @deprecated
 */
@Deprecated
class Empl {
    /**
     * Получить ЗП
     *
     * @return зарплата
     */
    int getSalary() {
        return 10;
    }

    /**
     * Готовка
     */
    void cook() {
    }

    /**
     * Уборка
     */
    void cleanFloor() {
    }

    /**
     * Доставка
     */
    void deliverFood() {
    }
}
