package pattern.transobj;

interface SrvUsr {

}

/**
 * <b>Основной класс</b>.
 * <p>
 * Концепция - всё собирается в один класс и его уже и выдёргиваем.
 *
 * @author IKudryashov
 * @since 30.05.2018 (13:14)
 */
public class TrObjectMain {
    BO bo = new BO();
}

/**
 * Класс, который отдаёт юзера.
 *
 * @author IKudryashov
 * @since 30.05.2018 (13:33)
 */
class ServiceEJB {
    public User getUser() {
        User user = new User();
        user.setuName("Vachok");
        return new User();
    }
}

/**
 * Класс, который отдаёт юзера.
 *
 * @author IKudryashov
 * @since 30.05.2018 (13:33)
 */
class ServiceJMX {
    public User getUser() {
        User user = new User();
        user.setuName("Vachok");
        return new User();
    }
}

/**
 * Business Object.
 *
 * @author IKudryashov
 * @since 30.05.2018 (13:34)
 */
class BO {
    ServiceEJB serviceEJB = new ServiceEJB();

    public User getUser() {
        return serviceEJB.getUser();
    }
}