package pattern.buisdelegate;

/**
 * Достаёт сервисы из хранилища.
 *
 * @author IKudryashov
 * @see BusinDelegate
 * @since 22.05.2018 (12:14)
 */
class LookupServ {
    BusinessServ getService(String servType) {
        if (servType.equals("ejb")) return new EJBService();
        else return new GMSService();
    }
}
