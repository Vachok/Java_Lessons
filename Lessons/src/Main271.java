import java.io.IOException;
import java.util.Formatter;
import java.util.logging.*;



public class Main271 {
   
   private static final Logger logger = Logger.getGlobal();
   /*  Принято указывать имя именем класса
     private static final Logger logger2 = Logger.getLogger(MyJComp.class.getName());
     */
   public static void main(String[] args) throws IOException {
      
      Handler consoleHandler = new ConsoleHandler();
      Handler fileHandler = new FileHandler("myJava.log");
      consoleHandler.setFilter(new MyFilter());
      consoleHandler.setFormatter(new MyFormatter());
      logger.setUseParentHandlers(false);
      logger.addHandler(consoleHandler);
      logger.addHandler(fileHandler);
      logger.info("info");
      logger.info("info vachok");
   }
   // фильтовать события
   static class MyFilter implements Filter {
      
      @Override
      public boolean isLoggable(LogRecord record) {
         
         return record.getMessage().endsWith("vachok");
      }
   }
   
   
   // форматировать вывод
   static class MyFormatter extends java.util.logging.Formatter {
      
      @Override
      public String format(LogRecord record) {
         
         return record.getLevel() + ":" + record.getMessage();
      }
   }
}


/* Логгирование только в файл
{
//      Handler consoleHandler = new ConsoleHandler();
      Handler fileHandler = new FileHandler();
      logger.setUseParentHandlers(false);
      logger.addHandler(fileHandler);
      logger.warning("info");
      }*/

/*
      new StreamHandler();
      new SocketHandler();*/

      
  /* Переопределение параметров логгирования
      LogManager.getLogManager().readConfiguration();
      System.out.println(System.getProperty("java.util.logging.config.file"));
      logger.info("message");*/
      
/*      Установка уровня логгирования
      logger.log(Level.FINER, "finer");
      logger.log(Level.INFO, "info");
      logger.log(Level.WARNING, "warn", new Throwable());*/
// at 19.01.2018 (14:05)