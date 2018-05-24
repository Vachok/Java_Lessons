package pattern.intercfilter;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * Фильтруем по-ip
 *
 * @author IKudryashov
 * @see AuthFilter
 * @see FilterChain
 * @since 24.05.2018 (9:23)
 */
class IpFilter implements InFilter {
    @Override
    public void exec(String data) {
        System.out.println("IpFilter.exec " + data);
    }
}

