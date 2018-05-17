package pattern.observ;

import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Scanner;

/**
 * <b>Основной класс</b>
 <p>
 Обзервер - это один-на-многих.
 Медиатор - это многие-на-один. {@link pattern.mediator} - это как
 прослойка между коммуницируемыми объектами, когда объекты не знают
 друг про друга;
 в то время, как
 {@link pattern.observ} - это наоборот. То, что позволяет
 объектам коммуницировать друг с другом.
 * @author IKudryashov
 * @since 08.05.2018 (15:19)
 */
public class ObsMain {
    /**
     * Меняет {@link Observerr#state}.
     * <p>
     * Т.к. обзерверы друг-друга слушают, меняя статус одного, опрашивается
     * и выводится статус второго. <code>one changed new
     * two changed null</code>
     * <p>
     * <code>one changed new
     * two changed null
     * one changed new
     * two changed hello</code>
     * <p>
     *
     * @param args null
     * @see Observerr#setState(String)
     */
    public static void main(String[] args) {
        Observerr observerr = new Observerr("one");
        Observerr observerr2 = new Observerr("two");
        observerr.setState("new");
        observerr2.setState("hello");
    }
}
