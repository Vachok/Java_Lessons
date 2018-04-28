package pattern.proto;

/**
 Объект для клонирования. Пример.
 <p>
 Класс должен имплементить {@link Cloneable} и оверрайдить метод {@link #clone()}

 @since 27.04.2018 (21:40) */
class Student implements Cloneable {
    /**
     Метод из интерфейса {@link Cloneable}.

     @return клон этого класса

     @throws CloneNotSupportedException не поддерживает клонирование
     @see Student
     @see Cash
     */
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}