package pattern.servlocator;

/**
 * Условный сервис 1
 *
 * @author IKudryashov
 * @see SrvLocatorMain
 * @since 29.05.2018 (17:05)
 */
class Serv1 implements Servic {
    /**
     * @return имя
     */
    @Override
    public String getName() {
        return this.toString();
    }

    /**
     * Работа
     */
    @Override
    public void exec() {
        System.out.println("Executing s1");
    }
}
