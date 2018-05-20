package pattern.nullobj;

import java.io.File;

/**
 * <b>Основной класс</b>
 * <p>
 * <b>Pattern</b>, для борьбы с <b>Null Pointer Exeption</b>.
 *
 * @author IKudryashov
 * @see Animal
 * @since 18.05.2018 (15:08)
 */
public class NullMainOk {
    public static void main(String[] args) {
        Animal animal = getAnimal();
    }

    /**
     * Если существует файл, <code>nofile.txt</code>, вернём нового льва.
     * Но если нет, то отдаём <b>null</b>.
     *
     * @return {@link Lion} or null.
     */
    static Animal getAnimal() {
        try {
            if (new File("nofile.txt").exists()) {
                new Lion();
            }
        } finally {
            return new NoAnimal();
        }
    }
}

