package pattern.objpool;

import java.util.LinkedList;
import java.util.List;

/**
 * <b>Бассейн</b>
 *
 * @since 28.04.2018
 */
class ObjectPoll {
    /**
     * Свободный LinkedList хранимых объектов
     */
    List<PooledObject> free = new LinkedList<>();
    /**
     * Занятый LinkedList хранимых объектов
     */
    List<PooledObject> used = new LinkedList<>();

    /**
     * <p>Освобождение объекта.</p>
     * Удаляет объект из используемых used и помещает в free@param pooledObject@param pooledObject
     *
     * @param pooledObject объект, который нужно освободить.
     */
    public void releasePooledObject(PooledObject pooledObject) {
        used.remove(getPooledObject());
        free.add(getPooledObject());

    }

    /**
     * Если нет свободных {@link PooledObject}, создаём.
     * Добавим в массив {@link #free}, чтобы потом его можно было использовать.
     * Если объект есть, то возьмём первый, и закинем его в {@link #used}
     * <p>
     * Returns:
     *
     * @return Отдаёт {@link PooledObject} из пула.
     */
    PooledObject getPooledObject() {
        if (free.isEmpty()) {
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        } else {
            PooledObject pooledObject = free.get(0);
            used.add(pooledObject);
            free.remove(pooledObject);
            return pooledObject;
        }
    }
}


