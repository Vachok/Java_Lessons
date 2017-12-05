public class ArrayExample {
    public static void main( String[] args ) {
        method(new int[]{1,4,2});
    }
    static void method(int[] j) {
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
        }
    }
}