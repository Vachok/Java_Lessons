package pattern.objpool;

import java.util.Random;

/**
 <b>Объект, который будет в пуле</b>

 @since 28.04.2018 */
class PooledObject {
    /**
     @return ответ от объекта.
     */
    @Override
    public String toString() {
        return "PooledObject{Йа твой объект и йа плаваю в бассейне!} - " + PooledObject.class.getTypeName() + new Random(10).nextInt();
    }
}