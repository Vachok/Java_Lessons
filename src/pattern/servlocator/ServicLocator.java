package pattern.servlocator;

/**
 * Класс, который контроллирует.
 *
 * @author IKudryashov
 * @see InitContext
 * @since 30.05.2018 (11:50)
 */
class ServicLocator {
    private static CacheR cacheR;

    static {
        cacheR = new CacheR();
    }

    /**
     * Проверка - есть ли сервис в кэше.
     *
     * @param jndiName имя сервива
     * @return сервис
     */
    public static Servic getServic(String jndiName) {
        Servic servic = cacheR.getServic(jndiName);
        if (servic != null) {
            return servic;
        }
        InitContext context = new InitContext();
        Servic servic1 = (Servic) context.lookUp(jndiName);
        cacheR.addServic(servic1);
        return servic1;
    }
}
