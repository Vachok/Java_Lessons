package lessons.general.grasppat;

/**
 * Use <b>creators</b>
 * <p>
 * Если ипользуется агрегация (один объект не может без другого), главный объект должен отвечать за создание "ведомых".
 * <p>
 * Information Expert Pattern <br>
 * Если класс, создаёт другой объект, класс должен иметь всю информацию о создаваемом. {@link Car#Car()}
 *
 * @since 23.01.2019 (12:12)
 */
public class GRACPCreator {

    public static void main(String[] args) {
        Car car = new Car();
        Car carBad = new Car(new AutoRadio("Information Expert Pattern"));
    }

}

