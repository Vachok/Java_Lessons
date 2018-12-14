package lessons.general.lists;

import java.util.ArrayList;
import java.util.List;

/**
 Большое кол-во элементов.
 @since 17.12.2018 (9:49)
 */
public class AddElementsToMassive {

    /**
     * В {@link ArrayList} нельзя добавить более чем {@link Integer#MAX_VALUE} значений.
     <p>
     Потому что в имплементации {@link List} - патаметр {@link List#size()} - это <b>int</b>! <br>
     {@link java.util.LinkedList} может добавить бОльшее кол-во значений.
     */
    public static void addToList() {
        List<Integer> integerList = new ArrayList<>(2_000_000_000);

        for (int i = 0; i < 2_000_000_000 ; i++) {
            integerList.add(i);
        }
    }

}
