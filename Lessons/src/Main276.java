import javafx.scene.Parent;

import java.io.IOException;



public class Main276 {
   
   public static void main(String[] args) {
      
      Main276 main276 = new Main276();
      main276.method(null);
      
/*   https://goo.gl/bGNBWk
      main276.method( null);*/
   }
   void method(Parrent p) {
      
      System.out.println("parrent");
   }
   void method(Child c) {
      
      System.out.println("child");
   }
}


class Parrent {

}


class Child {

}



   /* Можно делать различные варианты. Суть в том, чтобы было несколько методов
   с одинаковыми именами, но разными параметрами. В зависимости от полученных параметров,
   программа выполнит тот или иной метод
   
   // (1)void method(String s){ обычная перегрузка
   
  //(2) void method(double d, int i){
  private synchronized String method(String s)throws IOException{
      System.out.println("string");
      return s;
   }
   // (1)void method(int i){ обычная перегрузка
   
  // (2) void method(int i, double d){
  public final void method(int i){
      System.out.println("int");
   }
   
   public static void main(String[] args) throws IOException {
      Main276 main276 = new Main276();
      
  //  (2)  main276.method(5, 4); в этом случае непонятно - где double, а где int
      
      main276.method(5);
      main276.method("");
   }*/

// at 22.01.2018 (15:53)