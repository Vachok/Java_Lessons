package java9.prochandler;



import java.io.IOException;
import java.util.Optional;



public class Prhandl {
   
   public static void main(String[] args) throws IOException, InterruptedException {
      
      Process sleeper = Runtime.getRuntime().exec("c:\\windows\\system32\\cmd.exe");
      long processHandlePid = sleeper.pid();
      Optional<ProcessHandle> processHandle = ProcessHandle.of(processHandlePid);
      processHandle.get().onExit().thenRun(() -> System.out.println("exit"));
      System.out.println(processHandle.get().info().user().orElse("no user"));
      System.out.println(processHandle.get().info().commandLine().orElse("empty"));
      
      processHandle.get().destroy();
      Thread.sleep(100);
   }
}