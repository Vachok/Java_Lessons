package solid.singleresp;

/**
 * Класс должен иметь только одну причину на редактирование.
 *
 * @see Empl
 * @see EmplGood
 * @see EmplFace
 * @since 01.06.2018 (11:51)
 */
public static class SingleRespMain {
    EmplFacad emplFacad = new EmplFacad();
    emplFacad.cook();
}

