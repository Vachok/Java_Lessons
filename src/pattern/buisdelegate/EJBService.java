package pattern.buisdelegate;

/**
 * Какой-то сервис
 *
 * @author IKudryashov
 * @see BdelegateMain
 * @since 22.05.2018 (12:01)
 */
class EJBService implements BusinessServ {
    @Override
    public void doJob() {
        System.out.println(" EJB ");
    }
}
