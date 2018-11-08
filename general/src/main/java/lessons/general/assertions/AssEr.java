package lessons.general.assertions;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Assertions</h1>
 * <p>
 * {@link #goApp()}
 *
 * @since 02.08.2018 (12:39)
 */
public class AssEr implements Lessons {
    /**
     * Номер Issue на GitHub . номер
     * <a href="https://www.youtube.com/playlist?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Java Lesson</a>
     */
    private static final Double ID_LESSON = 634.321;
    private static final String SOURCE_CLASS = AssEr.class.getSimpleName();
    /**
     * <h3>{@link Map}, для отправки в БД/файл</h3>.
     */
    static Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * <h2>assert - проверка</h2>
     * <p>
     * 0. Начало урока.
     * По-умолчанию они выключены. Нужно передать VM-option -ea.
     * Для чего: {@link #goApp1()}
     */
    static void goApp() {
        int x = 5;
        assert x > 2;
//assert false;
        goApp1();
    }

    /**
     * .0 {@link #goApp()}.
     * <p>
     * Например, есть оператор switch. Он завист от переменной x.
     * Тоже каксается if.
     * <p>
     * Например в этом методе, в if выполняются 2 условия. НО если вдруг произойдёт третье (Unreal) - это можно проверить.
     */
    private static void goApp1() {
        int x = 5;
        switch (x) {
            case 1:
                break;
            case 2:
                break;
            default:
//                assert false;
        }
        if (true) {
            System.out.println("AssEr.1");
            linksToSave.put(SOURCE_CLASS, "AssEr.1");
        } else if (false) {
            System.out.println("AssEr.2");
            linksToSave.put(SOURCE_CLASS, "AssEr.2");
        } else {
            System.out.println("AssEr.UNREAL");
            linksToSave.put(SOURCE_CLASS, "AssEr.UNREAL");
//            assert false;
        }
        goApp2(new String[1]);
    }

    /**
     * <h2>Вариант</h2>
     * <p>
     * Как правило, assert не ставят на public методы.
     * <p>
     * Через двоеточие обязателен объект, который можно привести в {@link String}.
     * {@link #getI()}
     *
     * @param args для проверки на аргументы
     */
    private static void goApp2(String[] args) {
        System.out.println("AssEr.goApp2");
        linksToSave.put(SOURCE_CLASS, "AssEr.goApp2");
        assert args.length > 0 : getI();
//        assert args.length > 0 : getVoidI();
    }

    /**<h2>assert : </h2>
     * @return test
     */
    private static int getI() {
        return 5;
    }

    /**
     * <h2>VOID</h2>
     * метод assert :
     * должен возвращать что-то преобразуемое в {@link String}
     */
    private static void getVoidI() {
    }

    /**
     * <b>Сохнанение прогресса</b>
     *
     * @param lessonName in DB
     * @param links      in DB
     * @param saveToDB   true = save
     */
    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        System.out.println(SOURCE_CLASS);
        linksToSave.put(SOURCE_CLASS, this.toString());
        SaverProgress saverProgress = new SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, String.valueOf(ID_LESSON));
        } else {
            Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
        }
    }

    /**
     * <h2>Загрузочный метод. Запуск класса.</h2>
     */
    @Override
    public void launchMe() {
        goApp();
        boolean isSave = true;
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSave);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/637", isSave);
        linksPut(getClass().getSimpleName(),
            "https://youtu.be/VCY_oxXa6PU", isSave);

    }

    /**<h2>Assert Exception</h2>
     * assert может включать эксеншн.
     */
    private void assExcept() {
        assert linksToSave.size() > 0 : new IndexOutOfBoundsException("bla");
        linksToSave.put(SOURCE_CLASS, "AssEr.assExcept");
    }
}
