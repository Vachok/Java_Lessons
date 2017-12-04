public class Overload {
   public static int addTwoDigits(int a, int b) {
        return a + b;
    }
  protected final double addTwoDigits() {
        return 4;
    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        System.out.println(addTwoDigits(5,6));
        System.out.println(overload.addTwoDigits());
    }
}
