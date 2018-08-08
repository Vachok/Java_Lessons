package lessons.general.rwlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <h1>Класс-пример. Книга</h1>
 *
 * @since 03.08.2018 (14:28)
 * @see ReadWriteLock
 */
class Book{
    private static final String SOURCE_CLASS = Book.class.getSimpleName();
    /**
     * <h2>Название книги</h2>
     */
    String name;
    /**
     * <h2>Число экземпляров</h2>
     */
    int buyTime;
    /**
     * <h2>фейс</h2> {@link ReadWriteLock}
     * получим из него {@link ReentrantReadWriteLock}
     */
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    /**
     * <h2>{@link Lock} чтение</h2>
     */
    Lock readLock = readWriteLock.readLock();
    /**
     * <h2>{@link Lock} запись</h2>
     */
    Lock writeLock = readWriteLock.writeLock();

    /**<h2>Добавить экземпляр</h2>
     *
     * Все потоки, которые будут заходить в этот метод, будут просить JAVA
     * поставить {@link Lock } на запись.
     * {@link #howManyBooks()}
     *
     */
    public void abbBuy(){
        writeLock.lock();
        buyTime++;
        writeLock.lock();
    }

    /**
     * <h2>Сколько экземпляров</h2>
     * Тоже необходимо залочить. Чтобы не отличались цифры в отчётах.
     */
    public void howManyBooks(){
        readLock.lock();
        System.out.println("Book.howManyBooks "+buyTime);

        sendReport();
        readLock.unlock();
    }
    private void sendReport(){

    }
}
