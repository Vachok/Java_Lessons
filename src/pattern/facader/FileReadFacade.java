package pattern.facader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Фасад для {@link FacaMain#main(String[])}
 *
 * @author IKudryashov
 * @since 03.05.2018
 */
class FileReadFacade {
    /**
     * Example
     *
     * @param fileName имя файла
     * @return example
     * @throws IOException файловая система.
     */
    String readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;
        while ((j = reader.read()) != -1) {
            stringBuilder.append((char) j);
        }
        return String.valueOf(stringBuilder);
    }
}
