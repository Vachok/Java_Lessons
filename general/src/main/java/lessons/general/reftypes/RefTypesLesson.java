package lessons.general.reftypes;

import lessons.general.Lessons;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.logging.Logger;

/**
 * Типы Reference
 * <p>Strong - это чёткая ссылка.
 *     Soft Weak и Phantom.<br>
 *     Soft - храниться до переполнения памяти <br>
 *         Weak - Храниться до первого GC <br>
 *             Phantom - для проверки, что объекта больше нет.
 * @since 18.12.2018 (17:07)
 */
public class RefTypesLesson implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(RefTypesLesson.class.getSimpleName());

    @Override
    public void launchMe() {
        LOGGER.info("RefTypesLesson.launchMe");
        linksPut("686-348", "https://youtu.be/yBcV-zcCifE", true);
        try {
            LOGGER.info(wtRef().get().toString());
            LOGGER.info(softReference().get().toString());
            LOGGER.info(phantomReference().get().toString());
            System.gc();
        } catch (InterruptedException | NullPointerException e) {
            LOGGER.warning(e.getMessage());
            LOGGER.info(wtRef().get().toString());
            LOGGER.info(softReference().get().toString());
        }
    }

    /**
     * Strong type reference
     * <p>
     * Пока объект не == null, он не может быть собран garbage collector.
     *
     * @return {@link Object}
     */
    private Object strongType() {
        Object o = new Object();
        o = new MyObject();
        return o;
    }

    /**
     * Weak reference
     * <p>
     * "Призрак" strong type. То, что от него осталось после обнуления. <br>
     * Очищается при следующем запуске GC.
     *
     * @return {@link WeakReference}
     */
    private WeakReference<Object> wtRef() {
        Object o = strongType();
        WeakReference<Object> weakReference = new WeakReference<>(o);
        Object o1 = weakReference.get();
        LOGGER.info(o.equals(o1) + " o.equals(o1)");
        return weakReference;
    }

    /**
     * Soft reference type
     * <p>
     * Это тоже что и {@link #wtRef()}, но очищается только при нехватке памяти.
     *
     * @return {@link SoftReference}
     */
    private SoftReference<Object> softReference() {
        SoftReference<Object> sRef = new SoftReference<Object>(strongType());
        return sRef;
    }

    /**
     * Phantom reference
     * <p>
     * Нужен для проверки на отсутствие объекта. Пока не произойтет выброс мусора, {@code referenceQueue.remove()} будет висеть.
     *
     * @return {@link PhantomReference}
     */
    private PhantomReference<Object> phantomReference() throws InterruptedException {
        Object o = strongType();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        PhantomReference<Object> reference = new PhantomReference<>(o, referenceQueue);
        o = null;
        return reference;
    }

    /**
     * {@link java.util.HashMap}, где все объекты {@link WeakReference}
     *
     * @return {@link WeakHashMap}
     */
    private WeakHashMap<?, ?> getWHM() {
        WeakHashMap<?, ?> weakHashMap = new WeakHashMap();
        return weakHashMap;
    }

    private Thread mySampleThr(ReferenceQueue<?> referenceQueue, PhantomReference<?> reference) {
        Thread msT = new Thread() {
            @Override
            public void run() {
                try {
                    referenceQueue.remove();
                    LOGGER.info("reference removed");
                } catch (InterruptedException e) {
                    LOGGER.info(e.getMessage());
                }
            }
        };
        return msT;
    }

    static class MyObject {
        @Override
        protected void finalize() throws Throwable {
            LOGGER.info("GC");
            System.gc();
            LOGGER.info("GC was run");
            LOGGER.info("FINAL");
        }
    }

}
