import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main( String[] args ) throws Exception {
        File file = new File("temp.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("exists");
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("1\n");
        fileWriter.write("2\n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        char[] chars = new char[20];
        fileReader.read(chars);
        System.out.println(chars);
    }
}