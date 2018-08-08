package lessons.general.eqhash;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b>Equals and HashCode глубже</b>
 * <p>
 * {@link #goApp()}
 * {@link CarCar}
 *
 * @since 08.08.2018 (14:16)
 */
@SuppressWarnings("ALL")
public class EqHash implements Lessons {
    private static final Double ID_LESSON = 661.336;
    private static final String SOURCE_CLASS = EqHash.class.getSimpleName();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    public static void goApp() {
    }

    /**
     * <b>Сохнанение прогресса</b>
     * <p>
     *
     * @param lessonname in DB
     * @param links      in DB
     * @param saveToDB   true = save
     */
    @Override
    public void linksPut(String lessonname, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(lessonname, links);
        SaverProgress saverProgress = new SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    /**
     * Загрузочный метод. Запуск класса.
     */
    @Override
    public void launchMe() {
        boolean isSaved = true;
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/661", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/Juav74bCtZ8", isSaved);

    }

    /**
     * <h1>Класс пример</h1>
     <p>
     Можем ли мы сравнить по хэшу поля?
     EQUALS должен сравнивать по <b>уникальным</b> полям.
     В классе должно быть уникальное поле, для каждого объекта. Напр. {@link #number} .
     Можно сравнивать и по-всем, но лучше по-уникалам. По всем полям - это лишний код. {@link #equals(Object)}
     {@link #hashCode()}
     <p>
     Eq и Хэш имеют контракт. Если Равны Екв - значит равны и по Хэш. Но если равны по Хэш, необязательно равны Екв.
     * @since 08.08.2018 (14:18)
     */
    static class CarCar {
        /**
         * <h2>Название</h2>
         */
        String name;
        /**
         * <h2>Цвет</h2>
         */
        String color;
        String number;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CarCar carCar = (CarCar) o;
            return number!=null?number.equals(carCar.number):carCar.number==null;
        }

        /**Генерить Хеш нужно по тем же полям, что и equals
         * Использовать другие поля в хэше можно только ели эти поля константны.
         * @return hashCode
         */
        @Override
        public int hashCode() {
            return number.hashCode();
        }
    }
}
