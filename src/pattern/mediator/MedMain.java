package pattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 Фейс медиатора.

 @since 08.05.2018 (13:33) */
interface MediatorFace {
    /**
     Должет отправить на всех запрос.
     Через {@link Collega}.

     @see MedMain
     @see ConcreteCollega
     */
    void reqAll(Collega collega);
}

/**
 Интерфейс "коллеги".

 @since 08.05.2018 (13:34) */
interface Collega {
    /**
     Не оповещён
     */
    void setFalse();

    /**
     Оповещён
     */
    void setTrue();

    /**
     Смена статуса
     */
    void changeStat();
}

/**
 <b>Основной класс</b>
 <p>
 Создан для облегчения общения между объектами.
 Что-то типа "сервера", который хранит директивы для объектов.
 Как пример - {@link javafx.scene.control.RadioButton} в группе.
 Прикол в том, что при замене статуса одного, статус меняют и остальные.
 Если нажата 1 кнопка, другая не может <a href="https://youtu.be/HrLaoKvgONE?t=100" target=_blank>активна</a> , и ждёт.
 <p><img src="chrome_2018-05-08_13-24-41.jpg" alt=""></p>

 @since 08.05.2018 (13:13) */
public class MedMain implements MediatorFace {
    /**
     Оповещаем всех.
     <p>
     3 коллеги, {@link ConcreteCollega} - 3 копии класса. Сменим их статус, с помощью
     {@link MedMain}

     @param args null
     */
    public static void main(String[] args) {
        System.out.println("Patterns: MEDIATOR! This: ");
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.add(new ConcreteCollega(concreteMediator, "Pediator"));
        concreteMediator.add(new ConcreteCollega(concreteMediator, "Gladiator"));
        ConcreteCollega concreteCollega = new ConcreteCollega(concreteMediator, "Hetfield Mediator");
        concreteCollega.changeStat();
    }

    /**
     Должет отправить на всех запрос.
     Через {@link Collega}.

     @param collega {@link Collega}

     @see MedMain
     @see ConcreteCollega
     */
    @Override
    public void reqAll(Collega collega) {

    }
}

/**
 Медиатор

 @see MedMain
 @since 08.05.2018 (13:33) */
@SuppressWarnings("ALL")
class ConcreteMediator implements MediatorFace {
    /**
     Массив, который хранит список коллег.
     */
    List<Collega> collegas = new ArrayList<>();

    /**
     Должет отправить на всех запрос.
     Через {@link Collega}.

     @param collega коллега, для оповещения.

     @see MedMain
     @see ConcreteCollega
     */
    @Override
    public void reqAll(Collega collega) {
        collega.setTrue();
        for (Collega coll : collegas) {
            if (coll != collega) {
                coll.setFalse();
            }
        }
    }

    /**
     Добавить коллегу.

     @param collega {@link Collega}
     */
    void add(Collega collega) {
        collegas.add(collega);
    }

}

/**
 "Коллега"

 @since 08.05.2018 (13:35) */
class ConcreteCollega implements Collega {
    /**
     Оповещён/Неоповещён

     @see Collega
     */
    boolean statUs;
    String name;
    /**
     @see MedMain
     */
    MediatorFace mediatorFace;

    /**
     Конструктор.@param mediatorFace {@link MedMain}.

     @param mediatorFace {@link MediatorFace}.
     @param name         имя.
     */
    public ConcreteCollega(MediatorFace mediatorFace, String name) {
        this.mediatorFace = mediatorFace;
        this.name = name;
    }

    /**
     Не оповещён
     */
    @Override
    public void setFalse() {
        statUs = false;
        System.out.println(name + " = " + false);
    }

    /**
     Оповещён
     */
    @Override
    public void setTrue() {
        statUs = true;
        System.out.println(name + " = " + true);
    }

    /**
     Смена статуса
     */
    @Override
    public void changeStat() {
        mediatorFace.reqAll(this);
    }
}