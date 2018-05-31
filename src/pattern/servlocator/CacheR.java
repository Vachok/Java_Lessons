package pattern.servlocator;

import java.util.ArrayList;
import java.util.List;

/**
 * Кэширующий класс.
 *
 * @author IKudryashov
 * @see SrvLocatorMain
 * @see Servic
 * @since 29.05.2018 (17:15)
 */
class CacheR {
    /**
     * Лист, где хранятся сервисы.
     */
    private List<Servic> servics = new ArrayList<>();

    /**
     * Запрос на сервис с нужным именем.
     *
     * @param servName имя сервиса
     * @return {@link Servic}
     */
    public Servic getServic(String servName) {
        for (Servic servic : servics) {
            if (servic.getName().equalsIgnoreCase(servName)) {
                System.out.println("servName = [" + servName + "]");
                return servic;
            }
        }
        return null;
    }

    /**
     * Добавляет сервис, если его нет.
     *
     * @param servic {@link Servic}
     */
    public void addServic(Servic servic) {
        boolean isExists = false;
        for (Servic servic1 : servics) {
            if (servic.getName().equalsIgnoreCase(servic1.getName())) {
                isExists = true;
            }
        }
        if (!isExists) servics.add(servic);
    }
}
