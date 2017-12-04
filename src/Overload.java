public class Overload {
    int addTwoDigits(int a, int b) {
        return a + b;
    }
    double addTwoDigits(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        System.out.println(overload.addTwoDigits(5,6));
        System.out.println(overload.addTwoDigits(2.5, 1.4));
    }
}
