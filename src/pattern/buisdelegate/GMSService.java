package pattern.buisdelegate;

/**
 * Какой-то сервис
 *
 * @author IKudryashov
 * @see BdelegateMain
 * @since 22.05.2018 (12:02)
 */
class GMSService implements BusinessServ {
    @Override
    public void doJob() {
        System.out.println(" GMS ");
    }
}

