package les.files.streams;



import java.io.*;
import java.util.zip.ZipInputStream;



public class Main {
   
   public static void main(String[] args) {
   
   }
}

/*
Есть 4 класса.

   Reader reader;
   Writer writer;
   InputStream inputStream;
   OutputStream outputStream;
   
первые 2 - для текста
вторые 2 - для байтов
Buffered - быстрее, современнее и есть некоторые методы, недоступные

Можно создавать цепочки из стримов. Уже зависит от фантазий.

1. FileInputStream - читает
2. BufferedInputStream - накладывает буфер
3. DataInputStrem - читает значения типа int и пр.
4. ZipInputStream - всё это в ZIP

ZipInputStream zipInputStream = new ZipInputStream(new DataInputStream(new BufferedInputStream(new FileInputStream("smile.txt"))));
* */



// https://goo.gl/VcV24E BufferedOutputStream быстрее
// https://goo.gl/dsB7i6 Записываем массив байт
// https://goo.gl/w8dvyS Записываем БАЙТЫ в файл
// https://goo.gl/vau9oy BufferedInputStream быстрее
// https://goo.gl/BsmxqX inputStream.avaliable
// https://goo.gl/NXLixT до тех пор, пока байт не равен 0
// https://goo.gl/EE7tex Прочесть побайтово через InputStream
// https://goo.gl/bzUpfm  try с ресурсами для записи
// https://goo.gl/6JJWX5 BufferedWriter
// https://goo.gl/ivKS7t запись в файл
// https://gist.github.com/Vachok/dd0cd2d6cc2969f5d389e42626ff1357 BufferedReader
// https://goo.gl/VHD9ky является ли символ буквой или пробелом, тогда читать чтение с проверкой.
// https//goo.gl/TUV9zt чтение в массив
// https//goo.gl/xwJhiX самый простой способ чтения файла
// https//goo.gl/hWaouH основное для работы с файлами
// at 24//24.01.2018 (10:47)