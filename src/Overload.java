import java.io.IOException;

public class Overload {
   public static int addTwoDigits(int a, int b) {
        return a + b;
    }
  protected final double addTwoDigits() throws RuntimeException {
        return 4;
    }

    public static void main(String[] args) throws Exception {
        OverloadChild overload = new OverloadChild();
        System.out.println(addTwoDigits(5,6));
        System.out.println(overload.addTwoDigits());
        overload.addTwoDigits(5);
    }
}

class OverloadChild extends Overload {
    void addTwoDigits(int i) {
        System.out.println("overload method");

    }
}