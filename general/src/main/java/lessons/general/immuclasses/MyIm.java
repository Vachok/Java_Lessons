package lessons.general.immuclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Не мутирующий класс
 * <p>
 *
 * @since 24.01.2019 (11:51)
 */
public final class MyIm {
    /**
     * Примитивы финалятся без проблем
     */
    private final int i;
    /**
     * Коллекции нужно склонировать и сделать unmodifiable
     */
    private final List<String> list;
    /**
     * Если есть доступ к объекту - клонируем, и финалим.
     */
    private final PersonI personI;
    /**
     * Immutable по-умолчанию
     */
    private final String string;
    /**
     * Если мы не имеем доступ к объекту, и не можем сделать клон, придётся писать обёртку.
     *
     * @deprecated
     */
    @Deprecated
    private final Object object = null;

    /**
     * Default constructor
     * <p>
     *
     * @param i       {@link #i}
     * @param list    {@link #list}
     * @param personI {@link #personI}
     * @param string  {@link #string}
     */
    public MyIm(int i, List<String> list, PersonI personI, String string) {
        this.i = i;
        this.list = Collections.unmodifiableList(clonedList(list));
        this.personI = (PersonI) personI.clone();
        this.string = string;
    }

    public int getI() {
        return i;
    }

    public List<String> getList() {
        return list;
    }

    public PersonI getPersonI() {
        return (PersonI) personI.clone();
    }

    public String getString() {
        return string;
    }

    /**
     * Клонирование {@link List}
     *
     * @param l лист на клонирование
     * @return клон листа
     */
    private List<String> clonedList(List<String> l) {
        List<String> retList = new ArrayList<>(l.size());
        for (String s : l) {
            retList.add(s);
        }
        return retList;
    }
}
