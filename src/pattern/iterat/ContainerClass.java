package pattern.iterat;

/**
 Класс-пример.
 <p>
 Его надо "проитерировать".

 @see IterMain
 @since 08.05.2018 (12:39) */
class ContainerClass implements ContainerFace {
    /**
     Массив, который будем итерировать.
     */
    String[] array = {"Vachok", "Vaka", "Ivan", "Kudr"};

    /**
     @return new {@link ArIterator}
     */
    @Override
    public IteratorFace getIterator() {
        return new ArIterator();
    }

    /**
     Итератор массива.

     @since 08.05.2018 (12:41)
     */
    private class ArIterator implements IteratorFace {
        /**
         Номер элемента из {@link ContainerClass#array}
         */
        int index;

        /**
         @return либо след. элемент из {@link ContainerClass#array}, либо null.
         */
        @Override
        public Object next() {
            if (hasNext()) {
                return array[index++];
            }
            return null;
        }

        /**
         Узнаём - есть ли ещё элементы.

         @return <code>true-false</code>
         */
        @Override
        public boolean hasNext() {
            return index < array.length;
        }
    }
}
