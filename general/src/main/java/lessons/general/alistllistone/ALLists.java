package lessons.general.alistllistone;

import lessons.general.Lessons;
import lessons.general.StartMe;

import java.util.*;

import java.util.concurrent.ConcurrentHashMap;

/**Разница {@link java.util.ArrayList} и {@link java.util.LinkedList}
 <p>
 {@link ArrayList} принято использовать в общих случаях.
 <p>
 {@link LinkedList} ghbyznj использовать как очередь.

 {@link #theLesson()}
 * @since 23.07.2018 (14:36)

 */
public class ALLists implements Lessons {


    @Override
    public void launchMe() {
        StartMe startMe = new StartMe(links, 623.316);
        startMe.launchMe();
        Map<String, String> links = new HashMap<>();
        links.put(this.getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/623");
        links.put("YouTube", "https://youtu.be/uSldKx6JVs0?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX");
    }
    /**
     * Есть A и L листы. Оба имплементят {@link java.util.List} (доступ может быть осуществлён по-индексу.)
     * Все элементы индексируются и хранятся с индексами.
     <p>
     <b>ArrayList</b>. Хранит данные в простом массиве {@link Object}ов. {@link ArrayList#elementData}.
     Позволяет пробегать по элементам. Работает быстро.
     {@link #arrayWorks(ArrayList)}
     <p>
     <b>LinkedList</b>. Хранит данные нодами. one-two-three. Всегда есть last и first.
     Элементы разбросаны в памяти, но между ними существуют ссылки. <i>Зачем?</i> В некоторых случаюх, ему требуется <b>гораздо</b>
     меньше операций на запрос.
     */
    private void theLesson(){
        System.out.println("ALLists.launchMe");
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        arrayList.add("three");

        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");
        linkedList.add("five");
        linkedList.add("three");

        arrayWorks(arrayList);
        linkedWorks(linkedList);
    }

    /**Особенности {@link LinkedList}
     *
     * -Удаление без смещения элементов. Потому что хранит ссылки на следующий-предыдущий элемент.
     *
     * @param linkedList {@link #launchMe()}
     */
    private void linkedWorks(LinkedList<String> linkedList) {
        long l = System.currentTimeMillis();
        for (String s:linkedList){
            System.out.println("lnn = " + s);
        }
        linkedList.remove("three");
        for (String s:linkedList){
            System.out.println("lnn = " + s);
        }
        System.out.println((System.currentTimeMillis() - l));
    }

    /**Особенности {@link ArrayList}
     *
     * -Удаляет первый встреченный элемент.
     * Посчитаем операции. 1-сверка, 2-сверка, 3-сверка!-попал-удалил, 5-сместил, 6-сместил. Итого - 6 операций.
     * 6 элементов - 6 операций.
     * При удалении по-индексу <b>не будет операции пробегания сначала!</b> Т.е. в данном примере будет 6-2 операции.
     * Потому что {@link ArrayList} implements {@link java.util.RandomAccess}, и берёт элемент сразу, без перебора.
     <p>
     Основная концепция. Если работать с индексами - {@link ArrayList} будет быстрее.

     * @param arrayList {@link #launchMe()}
     */
    private void arrayWorks(ArrayList<String> arrayList) {
        long l = System.currentTimeMillis();
        for (String s:arrayList){
            System.out.println("arr = " + s);
        }
        arrayList.remove("three");
        for (String s:arrayList){
            System.out.println("arr = " + s);
        }
        System.out.println((System.currentTimeMillis() - l));
    }
}
