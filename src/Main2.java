import java.util.concurrent.Phaser;



public class Main2 {
   public static void main(String[] args) {
      Phaser phaser = new Phaser();
      new Washer(phaser);
      new Washer(phaser);
   }
   static class Washer extends Thread {
      Phaser phaser;
      public Washer(Phaser phaser) {
         this.phaser = phaser;
         start();
      }

      @Override
      public void run() {
         System.out.println("WASHING");
      }
   }
}
// at 19.12.2017 (15:27)