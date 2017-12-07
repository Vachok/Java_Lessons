

public class Main {
    public static void main( String[] args ) {
        int[] arr = {1 , 2 , 3};
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
        for (int j = 0; j < arr.length; j++) { // аналог while
            System.out.println(arr[j]);
        }
    }
}