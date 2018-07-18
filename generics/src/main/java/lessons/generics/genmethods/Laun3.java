package lessons.generics.genmethods;


import lessons.generics.StartMe;
import lessons.generics.whatis.GenericsLesson;
import lessons.generics.whatis.Lessons;

import java.util.ArrayList;
import java.util.List;


/**
 * <b>Методы</b>
 * {@link #firstMeth()}
 * @since 18.07.2018 (14:29)

 */
public class Laun3 implements Lessons {
    private List<String> links = new ArrayList<>();
    @Override
    public void launchMe() {
        GenericsLesson g = new StartMe();
        links.add("Generic methods");
        links.add(this.getClass().getTypeName());
        links.add("https://www.youtube.com/watch?v=5et8IyafnWE&feature=youtu.be&list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX");
        firstMeth();
        g.progressSaver(links, false);
        System.out.println("links = " + links);
    }

    /**
     * Запуск
     * В стринговый GENERIC {@link Cell}, передадим {@link Integer} - {@link Cell#getE(Object)}
     * {@link #methGen(Object)}
     */
    private void firstMeth() {
        System.out.println("Laun4.firstMeth");
        Cell<String> cell = new Cell<>(new Laun3());
        System.out.println(cell.<Integer>getE(new Integer(5)));
        consGener();
    }

    private void consGener() {
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
