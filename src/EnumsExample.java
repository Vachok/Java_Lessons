public class EnumsExample {
    enum CoffeSize {
        SMALL(100), MEDIUM(200), BIG(300); //создание перечисления
        String coffeClass = "A";
        int ml;

        CoffeSize( int ml ) {
            this.ml = ml;
        }
        int getMl() {
            return ml;
        }
        String getCoffeClass() {
            return coffeClass;
        }
    }

    public static void main( String[] args ) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println(coffeSize); //выводим BIG
        System.out.println(coffeSize.getMl());
        System.out.println(coffeSize.getCoffeClass());
    }
}