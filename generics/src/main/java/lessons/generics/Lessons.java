package lessons.generics;


import lessons.generics.whatis.Launcher1;

/**
 * Его должны имплементить уроки.
 * @see GenericsLesson
 * @see Launcher1
 */
public interface Lessons {
    /**
     * Загрузочный метод. Запуск класса.
     */
     default void launchMe(){
         System.out.print(this.getClass().getTypeName());

     }
}
