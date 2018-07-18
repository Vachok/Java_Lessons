package lessons.generics.genmethods;


import lessons.generics.StartMe;
import lessons.generics.whatis.GenericsLesson;
import lessons.generics.whatis.Lessons;

import java.util.ArrayList;
import java.util.List;


/**
 * <a href="https://youtu.be/KkjCnEi3msI?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Generic методы</a>
 * {@link #firstMeth()}
 * @since 18.07.2018 (13:24)

 */
public class Laun3 implements Lessons {
    private List<String> links = new ArrayList<>();
    @Override
    public void launchMe() {
        GenericsLesson g = new StartMe();
        links.add("Generic methods");
        links.add(this.getClass().getTypeName());
        links.add("https://youtu.be/KkjCnEi3msI?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX&t=173");
        firstMeth();
        g.progressSaver(links, true);
        System.out.println("links = " + links);
    }

    /**
     * Запуск
     * В стринговый GENEIC {@link Cell}, передадим {@link Integer} - {@link Cell#getE(Object)}
     * {@link #methGen(Object)}
     */
    private void firstMeth() {
        System.out.println("Laun3.firstMeth");
        Cell<String> cell = new Cell<>();
        cell.getE(new Integer(5));
    }

    /** При создании generic-методов, обязательно до {@code void (int, String)}, не важно,
     указать что метод generic.
     @param t
     @param <T>
     @see Cell
     */
    <T> void methGen(T t){
    }
}
