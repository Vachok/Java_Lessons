package lessons.generics.gen6;

import lessons.generics.GenericsLesson;
import lessons.generics.Lessons;
import lessons.generics.StartMe;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**<a href="https://youtu.be/rtsVsbDJGuc?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Generic 6: Обобщеный и не обобщенный код</a>
 <p>
Шаблонные выражения. Коротко:
 <p>
 <i>EXTEND</i> = это для getting. {@link #howGet()} Достать данные
 <i>SUPER</i> = это для setting. {@link #lessonStart()} Положить данные
 <p>
 Для чего?
 Например есть коллекции. Мы хотим по ним бегать, но добавлять нам нет необходимости.
 Делаем универсальный шаблон <b>? extend</b>.Ну и соот. наоборот для сеттинга.
 <p>
 Sample: {@link #sampleExt}
 * @since 19.07.2018 (16:53)
 */
public class Launcher6 implements Lessons {

    private static final String SOURCE_CLASS = Launcher6.class.getSimpleName();
    private static GenericsLesson saver = new StartMe();
    private static List<String> links = new ArrayList<>();
    private static MessageToUser messageToUser = new MessageCons();
    private boolean db;

    public Launcher6(boolean db) {
        this.db = db;
    }

    @Override
    public void launchMe() {
        links.add(this.getClass().getSimpleName());
        links.add("Generic 6: Обобщеный и не обобщенный код >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        links.add("https://youtu.be/rtsVsbDJGuc?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX&t=180");
        saver.progressSaver(links, db, 622.315);
        lessonStart();
    }

    /**
     * Можно заставить класс {@link Cell}, хранить разные объекты.
     * для этого используется {@code ?}.
     * Например {@link Car}, {@link Opel}, {@link Opel}.
     * Но при этом потеряется возможность вообще что-либо делать с объектами в классе.
     * <p>
     * {@link #howDo()} - как решить эту проблему.
     */
    private void lessonStart() {
        System.out.println();
        System.out.println();
        System.out.println("links = " + links);
        Cell<?>cell = new Cell<Car>();
        Cell<?>cellT = new Cell<Astra>();
        Cell<?>cellO = new Cell<Opel>();
    //    Car car = cell.getT(); так не получится:(
        howDo();
    }

    /**
     * Для работы с объектами разного типа, используется или {@code super} или {@code extends}.
     <p>
     * <b>SUPER</b>. Справа могут быть любые объекты, выше класса (родители). {@link Astra}, {@link Object}.
     * {@link Car} добавляться не будет.
     <p>
     iспользование сеттера {@link #howDo2()}
     */
    private void howDo() {
        Cell<? super Opel>cell = new Cell<Object>();
        Cell<? super Opel>cellCa = new Cell<Car>();
      //  Cell<? super Opel>cellCaA = new Cell<Astra>();
        howDo2();
    }

    /**{@link #howDo()}
     *При сеттинге - наоборот. Можно сетать детей, но не родителей.
     *Как забирать объекты - {@link #howGet()}
     */
    private void howDo2() {
        Cell<? super Opel>cell = new Cell<Object>();
        cell.setT(new Astra());
      //  cell.setT(new Car());
        howGet();
    }

    /**{@link #howDo()}
     *Забрать можно cast-ом.
     * {@link #extWild()}
     */
    private void howGet() {
        Cell<? super Opel>cell = new Cell<Object>();
        cell.setT(new Astra());

     // notcompil   Opel opel = cell.getT();

        Opel opel = (Opel) cell.getT();
        extWild();
    }

    /**<b>? Extends</b>
     * Это работает в противоположную сторону от {@link #lessonStart()}.
     * Мы можем создавать Generic-детей.
     * При этом получается геттинг без cast'а. Но без возможности их сеттить напрямую, без приведения.
     *
     */
    private void extWild() {
        Cell<? extends Opel> cell = new Cell<Astra>();

        //notcompil Cell<? extends Opel> cellCa = new Cell<Car>();
        Opel t = cell.getT();
      //notcompil  cell.setT(new Opel());

    }

    /**
     * Пример, для чего нужно {@code ? extends}
     * Есть уже готовый лист "Опелей."
     * Мы можем создать новый лист, который будет ? {@code extends} {@link Opel}.
     * Пройтись по-нему, к примеру циклом FOR , выбрать нужные Опели, и что-нибудь с ними сделать :).
     *
     */
    private void sampleExt(){

        List<Object>arr = new ArrayList<>();
        List<? extends Opel> listOpel = null; // sample = (List<? extends Opel>) arr;
        for(Opel opel:listOpel){
            int i = opel.hashCode();
        }
    }
}
