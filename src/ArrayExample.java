public class ArrayExample {
    public static void main( String[] args ) {
        Object[] i = new Object[5]; //5 - massive size слово new - выделяет память
        int[] j = new int[3];
        j[0] = 2;
        j[2] = 1;
        j[1] = 3;
        for (int k = 0; k < j.length; k++) {
            System.out.println(j[k]);
        }
    }
}
