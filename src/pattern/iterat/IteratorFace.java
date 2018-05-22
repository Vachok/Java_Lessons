package pattern.iterat;

/**
 Фейс итератора
 <p>
 Тут должны быть 2 метода.

 @since 08.05.2018 (12:34) */
interface IteratorFace {
    boolean hasNext();

    Object next();
}

/**
 Контейнер, для коллекции

 @see ContainerClass
 @since 08.05.2018 (12:36) */
interface ContainerFace {
    IteratorFace getIterator();
}

