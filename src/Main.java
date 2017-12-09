import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Map map = new HashMap(); // хранит объекты, на основании Хэша. если ключ повторяется - кладёт в одну "ячейку"
        /*  Obj.hash = 3
            Obj.hash = 3     Obj.hash =1
        ___ ______________ ____________ (RAM)
        * */
        Map map2 = new Hashtable();
        Map map3 = new LinkedHashMap();
        Map map4 = new TreeMap();
        map.put("1" , "one"); // в массив table, где хранятся ноды
        map.put("3" , "three"); // создается перем. tab, добавляется в table, после вычисл. хэш.
        map.put("2" , "two"); // проверка - есть ли объект с таким хэш. если нет - создает новый.
        System.out.println(map.get("3"));
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.print(o);
        }
    }
}