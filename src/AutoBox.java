public class AutoBox {
    public static void main( String[] args ) {
        Integer i = new Integer(5);
        Integer j = new Integer("6");
        int k = Integer.parseInt("2");
        int g =  Integer.valueOf("3"); //парсит строку
        short s = i.shortValue(); //возвращает переконвертированное значение
    }
}
