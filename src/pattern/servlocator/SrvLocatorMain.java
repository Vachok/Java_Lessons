package pattern.servlocator;

/**
 * <b>Основной класс</b>
 <p>
 Есть клиент, который обращается в сервис-локатор {@link InitContext},  получает данные
 и работает с сервисами. Суть - он автоматически пишет сервис в кеш, и далее работает уже оттуда.
 @see Servic
 * @author IKudryashov
 * @since 24.05.2018 (10:03)
 */
public class SrvLocatorMain {
    public static void main(String[] args) {
        Servic servic = ServicLocator.getServic("Serv1");
        servic.exec();
        servic = ServicLocator.getServic("Serv2");
        servic.exec();
    }
}