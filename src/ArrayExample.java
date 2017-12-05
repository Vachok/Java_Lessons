public class ArrayExample {
    public static void main( String[] args ) {
        Object[] i = new Object[5]; //5 - massive size слово new - выделяет память
        int[] j = new int[3];
        for (int k = 0; k < j.length; k++) {
            System.out.println(i[k]);
        }
    }
}
