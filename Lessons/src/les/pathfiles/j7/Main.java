package les.pathfiles.j7;



import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class Main {
   
   public static void main(String[] args) throws Exception {
      
      Path path = Paths.get("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\temp.txt").toAbsolutePath();
      Files.walkFileTree(Paths.get("."),/* new HashSet<FileVisitOption>(), 1,*/ new MyFileVisitor());
   }
   static class MyFileVisitor extends SimpleFileVisitor<Path> {
      
      @Override
      public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
         
         System.out.println(file.getFileName());
         return FileVisitResult.CONTINUE;
      }
   }
   
   // https://goo.gl/cXea6T    Вывод ВСЕХ файлов
   // https://goo.gl/km1Qx1    Можно пробежать по-директории
   
   /*{
      Path path= Paths.get("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\temp.txt").toAbsolutePath();
//      List<String> list = Files.readAllLines(Paths.get("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\temp.txt"));
//      for (String s : list){
//         System.out.println(s); }
         

//      List<String> list1 = new ArrayList<String>();
//      list1.add("new");
//      list1.add("bla");
//      Files.write(path, list1);
      InputStream inputStream = Files.newInputStream(path);
      OutputStream outputStream = Files.newOutputStream(path);
      Reader reader = Files.newBufferedReader(path);
      Writer writer = Files.newBufferedWriter(path);
      }*/
}

// https://goo.gl/SeURbC   Можно брать стримы и сохранять их в файлы
// https://goo.gl/eXmgfS   Можно записать БЕЗ Writer
// https://goo.gl/fhX97y   Чтение файла построчно
// https://goo.gl/7htwkz   Запись массива байт
// https://goo.gl/f6mChA   Чтение в массив
// https://goo.gl/hNqfJk   FileAttributes
// https://goo.gl/ETvhmH   Основной функционал Files
// https://goo.gl/Pj26Ks   path.get
// https://goo.gl/3i72dd   Первая реализация работы с файлами
// at 24.01.2018 (14:49)