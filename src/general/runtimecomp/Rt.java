package general.runtimecomp;



import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;



public class Rt {
   
   public static void main(String[] args) {
      
      JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
      int result = compiler.run(null, null, null, "C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\src\\general\\runtimecomp\\Test.java");
      System.out.println(result);
   }
}
