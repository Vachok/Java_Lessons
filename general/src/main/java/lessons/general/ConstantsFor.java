package lessons.general;

import com.sun.nio.sctp.IllegalReceiveException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @since 08.11.2018 (15:36)
 */
public class ConstantsFor {
    private static List<String> buildGradle = new ArrayList<>();

    public ConstantsFor() {
        readFile();
    }

    private static String readFile() {
        try (InputStream inputStream = new FileInputStream("build.gradle")) {
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            int read = inputStream.available();
            while (read > 0) {
                String s = bufferedReader.readLine();
                buildGradle.add(s);
                System.out.println("read = " + read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalReceiveException();
    }

    public static String getIDLesson() {
        for (String s : buildGradle) {
            if (s.toLowerCase().contains("version '")) {
                return s.split("version '")[1].replace("\\Q'\\E", "");
            }
        }
        throw new IllegalReceiveException();
    }

    public static String getBookmark() {
        for (String s : buildGradle) {
            if (s.toLowerCase().contains("https://")) {
                return s.split(" ")[1];
            }
        }
    return "https://www.youtube.com/channel/UCBk48R8tFfqaDWUB84NENLQ";
    };
}
