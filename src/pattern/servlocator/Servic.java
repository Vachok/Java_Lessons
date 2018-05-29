package pattern.servlocator;

/**
 * Сервис фейс.
 *
 * @author IKudryashov
 * @see Serv1
 * @see Serv2
 * @see SrvLocatorMain
 * @since 29.05.2018 (17:04)
 */
interface Servic {
    /**
     * @return имя сервиса.
     */
    String getName();

    /**
     * Работа сервиса.
     */
    void exec();
}
