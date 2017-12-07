

public class Main {
    public static void main( String[] args ) {
        int[] arr = {1 , 2 , 3};
        int i = 0;
        for (; 5 < 6 && arr[1] > arr[2] || true; ) { //boolean-выражение. можно объединять &&
            System.out.println(arr[1]);
        }
    }
}