package pattern.buisdelegate;

/**
 * Делегирует сервисы. Запускает, даёт доступ.
 *
 * @author IKudryashov
 * @see LookupServ
 * @since 22.05.2018 (12:17)
 */
class BusinDelegate {
    LookupServ lookupServ = new LookupServ();
    BusinessServ businessServ;

    void doTask(String servType) {
        businessServ = lookupServ.getService(servType);
        businessServ.doJob();
    }
}
