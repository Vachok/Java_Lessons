public class ArrayExample {
    public static void main( String[] args ) {
        Object[] i = new Object[5]; //5 - massive size слово new - выделяет память
        int[][] j = new int[3][]; // массив в массиве. 3 элемента число элементов во 2х скобках не указывается
        int[] k = new int[5];
        j[0] = k; //нулевой элемнт массива = к
        for (int l = 0; l < j[0].length; l++) {
            System.out.println(j[0][1]);
        }
    }
}
