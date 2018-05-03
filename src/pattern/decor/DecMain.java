package pattern.decor;

import java.io.*;

/**
 * <b>Основной класс.</b>
 *<p>
 *     Декоратор - это обёртка, которая позволяет дописывать свой код к существующему.
 *     Например <code>InputStream inputStream = new <b>BufferedInputStream</b></code>
 *     Надстройка, когда есть уже функционал, а нам надо добавить свой.
 *     Берём готовый функционал. Пишем <code>абстрактный класс{@link FileDecorator}</code>
 *
 * @author 14350
 * @since 01.05.2018
 */
public class DecMain {
    /**
     * Хотим использовать {@link FileStreamReader}, но добавить ему функционал.
     * Тут понадобиться Декоратор. {@link FileDecorator}.
     * К оригинальному методу {@link FileDecorator#read()}, добавили функции
     * {@link FileBufferedReader#read()}.
     *
     * @param args null
     */
    public static void main(String[] args) {
        FileStream fileStream = new FileBufferedReader(new FileStreamReader());
        fileStream.read();
    }
}
