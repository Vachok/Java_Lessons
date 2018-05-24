package pattern.frontcont;

import java.util.Scanner;

/**
 * <b>Основной класс</b>
 <p>
 Контроллер. {@link DispatcherServlet}
 * @author IKudryashov
 * @since 23.05.2018 (14:54)
 */
public class FrontMain {
    /**
     * Здесь мы принимаем запрос и отправляем его в {@link DispatcherServlet}
     * Под каждый запрос - стартует новый поток.
     *
     * @param args null
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String nextLine = scanner.nextLine();
                new Thread(() -> new DispatcherServlet().process(nextLine)).start();
            }
        }
    }
}

