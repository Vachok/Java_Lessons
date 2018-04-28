package pattern.proto;

import java.util.Objects;

/**
 <b>Основной класс</b>
 <p>
 Прототип, это объект, который умеет клонировать сам себя.

 <b>Зачем?</b>
 Например, при создании большого объекта, постоянно обращаться к БД - не очень хорошая мысль.
 Тут на помощь и приходит клон.
 Сохраняем его в {@link Cash}, и работаем с ним оттуда.

 @since 27.04.2018 (20:42) */
public class ProtoMain implements Cloneable {

    /**
     Склонируем {@link Student}
     <p>
     Помещает клон {@link Student} в {@link Cash}
     Затем достанем наш клон с помощью <code>{@link Student} student = cash.getStudent();</code>
     Тут прототипом является {@link Student}.
     <code>
     student.hashCode() = 959447386
     studentClone.hashCode() = 453211571</code>

     @param args null
     */
    public static void main(String[] args) {
        Cash cash = new Cash();
        cash.setStudent(new Student());
        Student student = new Student();
        Student studentClone = null;
        try {
            studentClone = cash.getStudent();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("student = " + student.hashCode());
        System.out.println("studentClone = " + Objects.requireNonNull(studentClone).hashCode());
    }
}