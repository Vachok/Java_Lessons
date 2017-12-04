public class EnumsExample {
    enum CoffeSize {SMALL, MEDIUM, BIG} //создание перечисления

    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println(coffeSize); //выводим BIG
    }
}