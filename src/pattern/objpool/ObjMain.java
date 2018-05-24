package pattern.objpool;

/**
 * <b>Главный action class</b>
 * <p>
 * Pool - это как бассейн. Где происходит какой-нибудь action. Например, пул потоков приложения, или пул соединений в БД. Масса объектов.
 * <p>
 * Зачем?
 * <p>
 * Нужен, чтобы уменьшить число объектов. Пул может управляться, как единый объект. Позволяет переиспользовать объекты.
 *
 * @since 28.04.2018
 */
public class ObjMain {
    /**
     * Будем использовать {@link PooledObject}.
     *
     * @param args null
     */
    public static void main(String[] args) {
        ObjectPoll objectPoll = new ObjectPoll();
        PooledObject pooledObject = objectPoll.getPooledObject(); // взяли1
        PooledObject pooledObject2 = objectPoll.getPooledObject(); // взяли2
        System.out.println("pooledObject = " + pooledObject.toString());
        objectPoll.releasePooledObject(pooledObject);
        System.out.println("pooledObject2 = " + pooledObject2.toString());
    }
}
