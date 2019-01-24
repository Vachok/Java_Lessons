package lessons.general.externalizer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Пример {@link Externalizable}
 * <p>
 *
 * @since 24.01.2019 (11:23)
 */
class House implements Externalizable {

    int roomsInDa;

    /**
     * @param out {@link #roomsInDa}
     * @throws IOException
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(roomsInDa);
    }

    /**
     * @param in {@link #roomsInDa}
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        roomsInDa = in.readInt();
    }
}
