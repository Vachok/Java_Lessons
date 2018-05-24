package pattern.intercfilter;

/**
 * Фильтр по-авторизации.
 * <p>
 * Пропускаем только авторизованных юзеров.
 *
 * @author IKudryashov
 * @see IpFilter
 * @since 24.05.2018 (9:20)
 */
class AuthFilter implements InFilter {

    @Override
    public void exec(String data) {
        System.out.println("AuthFilter.exec " + data);
    }
}

