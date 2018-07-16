package solid.intsegregation;

/**
 * Работник на полной ставке
 *
 * @see InterfaceSegregation
 * @see Worker
 * @see Eater
 * @since 16.07.2018 (14:15)
 */
interface IWorker extends Worker, Eater {
    /**
     * Рабочий день
     */
    void work();

    /**
     * Обеденный перерыв
     */
    void eat();
}