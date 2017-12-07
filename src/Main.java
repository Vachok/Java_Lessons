import java.io.File;

public class Main {
    public static void main( String[] args ) {
        File file = new File("temp.txt");
        if (file.isDirectory()) {
            System.out.println("dir");
        }
        if (file.isFile()) {
            System.out.println("file");
        }
    }
}