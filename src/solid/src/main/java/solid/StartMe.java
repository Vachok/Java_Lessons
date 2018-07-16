package solid;

import java.io.FileOutputStream;
import java.io.IOException;

public class StartMe {

    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("java.docs")) {
            String docS = "-linksource -keywords -encoding UTF-8 -nohelp -html5 -windowtitle \"JAVA Lessons\" -doctitle \"Patterns\" -bottom \"GitHub YouTube\" --allow-script-in-comments git rm --cached --force \"filename\"";
            for (byte b : docS.getBytes()) {
                fileOutputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("THE GRADLE!");
    }
}
