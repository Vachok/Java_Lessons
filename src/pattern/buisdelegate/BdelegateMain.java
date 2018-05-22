package pattern.buisdelegate;

/**
 * <b>Основной класс</b>
 <p>
 Концепция. Есть клиент, и есть сетевые сервисы. BD - позволяет кэшировать сервисы,
 чтобы не обращатся к ним постоянно через интернет. {@link BusinessServ}
 <p>
 Клиент обращается к {@link BusinDelegate}, который просит {@link LookupServ} создать
 сервис нужного типа.
 * @author IKudryashov
 * @since 21.05.2018 (17:22)
 */
public class BdelegateMain {
    /**
     * Воспользуемся делегированием.
     *
     * @param args null
     */
    public static void main(String[] args) {
        BusinDelegate businDelegate = new BusinDelegate();
        businDelegate.doTask("ejb");
    }
}

