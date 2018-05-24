package pattern.intercfilter;

/**
 * <b>Основной класс</b>
 * <p>
 *По-сути своей фаерволл.
 * @see InFilter
 * @author IKudryashov
 * @since 23.05.2018 (16:39)
 */
public class InterFilterMain {
    /**
     * Создадим {@link InFiltManager}, для управления.
     */
    static InFiltManager inFiltManager = new InFiltManager();

    /**
     * Запустим фильтры {@link IpFilter}, {@link AuthFilter}.
     * <p>
     * Получаем какой-то реквест, {@code "hi"}, потом его отдаём в {@link FilterChain},
     * прогоняем по-цепочкам, если всё ок и все цепочки прошли, выполняем {@link TargtClass}.
     *
     * @param args null
     * @see FilterChain
     */
    public static void main(String[] args) {
        inFiltManager.setFilter(new AuthFilter());
        inFiltManager.setFilter(new IpFilter());
        inFiltManager.filterReq("hi");
    }
}