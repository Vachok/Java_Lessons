public class EnumsExample {
    enum CoffeSize {SMALL, MEDIUM, BIG}

    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println(coffeSize);
    }
}

class CoffeSize2 {
    public static final  CoffeSize2 SMALL = new CoffeSize2();
    public static final  CoffeSize2 MEDIUM = new CoffeSize2();
    public static final  CoffeSize2 BIG = new CoffeSize2();


}
}