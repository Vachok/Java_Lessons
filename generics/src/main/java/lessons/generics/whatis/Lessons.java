package lessons.generics.whatis;


/**
 * Его должны имплементить уроки.
 * @see GenericsLesson
 * @see Main
 */
public interface Lessons {
    /**
     * Загрузочный метод. Запуск класса.
     */
     default void launchMe(){
         System.out.print(this.getClass().getTypeName());
     }
}
