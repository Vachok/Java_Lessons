public class Car {

    int MAX_SPEED; //поле класса
    boolean var;
    Magnitola magnitola; //объектный
    void method() { //хранит в стеке
       // final int j =4; //в МЕТОДАХ необходимо задать значение. переменная доступа
        int MAX_SPEED = 4;
        System.out.println(MAX_SPEED);
    }



    /*ХИП = вся память
    * Стэк = кэш память "условно" */



    //Magnitola magnitola = null - по-default

/*    Car(int maxSpd) {
        maxSpeed = maxSpd;

    }

    void method() {
        maxSpeed = 6;
    }*/
}
//final static transient volatile int maxSpeed; //примитивный volatile - для многопоточности
//transient поле не учавствует в сериализации (превращение объекта в байты и наоборот)
//final пометить что констана
//final static int MAX_SPEED = 240; вид константы