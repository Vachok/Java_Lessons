package pattern.observ;

import java.util.Scanner;

/**
 * Готовый пример с вики.
 *
 * @deprecated
 */
@Deprecated
class EventSource extends java.util.Observable implements Runnable {
    @Override
    public void run() {
        while (true) {
            String resp = new Scanner(System.in).next();

        }
    }
}
