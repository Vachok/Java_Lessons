import java.util.concurrent.Exchanger;



static class Anket extends Thread {
   Exchanger<String> exchanger;

   public Anket(Exchanger<String> exchanger) {
      this.exchanger = exchanger;
      start();


   }
   @Override
   public void run() {
      try {
         String info = exchanger.exchange(null);
         System.out.println(info);
      }
      catch(InterruptedException e) {
         e.printStackTrace();
      }
   }

   public class Sem {
      public static void main(String[] args) {
         Exchanger<String> exchanger = new Exchanger<>();
      }
      static class Mike extends Thread {
         Exchanger<String> exchanger;


         public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
         }
         @Override
         public void run() throws InterruptedException {
            exchanger.exchange("Hi! I'm Mike");
            Thread.sleep(1000);
            exchanger.exchange("I'm 33");
            Thread.sleep(1000);
         }
      }
   }
// at 19.12.2017 (13:23)