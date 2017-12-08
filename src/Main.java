import java.util.*;

public class Main {
    public static void main( String[] args ) {
        // Элементы, для замены массивов
        // https://youtu.be/0sWpjUvbGcQ?t=29m0s
        Collections collections; // основной класс
        List list; // отличается индексацией. данные хранятся и выводятся по-индексам
        Set set; // выводит уникальные значения
        Queue queue; // очередь. как передали - так получили
        Map collection = new HashMap(); // объекты хранимые по-ключу
        collection.put("1" , "Dan Brown");
        collection.put("2" , "Kernegi");
        collection.put("3" , "Jack London");
        System.out.println(collection.get("2"));
        Set set = collection.keySet();
        for (Object o : set) {
            System.out.println(o);
        }
    }
}

