public class AutoBox {
    public static void main( String[] args ) {
//основные примитивные переменные (в отличие от ссылочных - они хранят только свои значения)
        int i;
        byte b;
        short s;
        long l;
        boolean bl;
        char ch;
        float f;
        double d;
//Обёртки
        Byte bt;
        Short shrt;
        Integer integer;
        Long lng;
        Boolean bln;
        Character chr;
        Float fl;
        Double doubl;

        List<Integer> list;

    }

    Object method() {
        return 1;// = new Integer(1;) обёртка приводит этот Object к Integer
    }
}
