public class EnumsExample {
    enum CoffeSize {SMALL, MEDIUM, BIG}

/*    То, что происходит в enum
class CoffeSize {
        public static final EnumsExample.CoffeSize SMALL = new EnumsExample.CoffeSize(1);
        CoffeSize(int i);

    }*/

    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println(coffeSize);
    }
}
