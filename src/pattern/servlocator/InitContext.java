package pattern.servlocator;


/**
 * Создаёт сервисы.
 * <p>
 * Отвечает на запросы клиента.
 * @author IKudryashov
 * @see SrvLocatorMain
 * @since 29.05.2018 (17:09)
 */
class InitContext {
    /**
     * @param jndiName имя запрошенного сервиса
     * @return новый запрошенный сервис.
     */
    public Object lookUp(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERV1")) {
            return new Serv1();
        } else if (jndiName.equalsIgnoreCase("SERV2")) {
            return new Serv2();
        }
        return new NullPointerException("...");
    }
}