package pattern.servlocator;

import javax.swing.*;

/**
 * Условный сервис 2
 *
 * @author IKudryashov
 * @see SrvLocatorMain
 * @since 29.05.2018 (17:06)
 */
class Serv2 implements Servic {
    /**
     * @return имя
     */
    @Override
    public String getName() {
        return this.toString();
    }

    /**
     * Работа
     */
    @Override
    public void exec() {
        System.out.println("Executing s2");
    }
}

