package lessons.general.externalizer;

import lessons.general.Lessons;

import java.io.*;
import java.util.logging.Logger;

/**
 * Externalizer
 * <p>
 * Контролируемая сериализация
 *
 * @see House
 * @since 24.01.2019 (11:16)
 */
public class ExternAliz implements Lessons {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void launchMe() {
        linksPut("704-360", "https://youtu.be/17HvqYh_WuQ", false);
        extA();
    }

    /**
     * Экстернализуем класс {@link House}
     */
    private void extA() {
        LOGGER.warning("ExternAliz.extA");
        House house = new House();
        house.roomsInDa = 5;
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("house.txt"))) {
            house.writeExternal(objectOutputStream);
        } catch (IOException e) {
            LOGGER.throwing("ExternAliz", "extA", e);
        }
        extB();
        LOGGER.info(house.roomsInDa + " rooms");
    }

    /**
     * Читаем записанный в {@link #extA()} класс
     */
    private void extB() {
        LOGGER.warning("ExternAliz.extB");
        House house = new House();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("house.txt"))) {
            house.readExternal(inputStream);
        } catch (IOException | ClassNotFoundException e) {
            LOGGER.throwing("ExternAliz", "extB", e);
        }
        LOGGER.info(house.roomsInDa + " rooms");
    }
}
