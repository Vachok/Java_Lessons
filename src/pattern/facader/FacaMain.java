package pattern.facader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;

/**
 * <b>Основной класс</b>
 * <p>
 * Суть - убрать сложную логику "под кат".
 * Прячет сложный функционал за интерфейс.
 *
 * @author IKudryashov
 * @since 03.05.2018 (11:41)
 */
public class FacaMain {
    /**
     * Допустим есть функционал.
     * Писать в этот метод - не очень верно.
     * Лучше создать класс или метод, отдельно выполняющий
     * код. {@link FileReadFacade}
     *
     * @param args null
     * @throws IOException работа с файловой системой
     */
    public static void main(String[] args) throws IOException {
        FileReadFacade fileReadFacade = new FileReadFacade();
        System.out.println(fileReadFacade.readFile("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\src\\pattern\\facader\\temp.txt"));
    }
}

