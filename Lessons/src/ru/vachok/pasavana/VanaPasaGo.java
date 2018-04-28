package ru.vachok.pasavana;



import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.jnlp.*;



public class VanaPasaGo {
   
   public static void main(String[] a) {
      
      Thread.currentThread().setName("PASAVANA");
      String[] surN = new String[]{"ВАНЯ", "ПАША"};
      Random random = new Random();
      Integer k = 0;
      Integer v = 0;
      JFrame jFrame = new JFrame();
      jFrame.setBounds(400, 300, 320, 120);
      JPanel jPanel = new JPanel();
      JProgressBar jProgressBar = new JProgressBar();
      jPanel.add(jProgressBar);
      jFrame.add(jPanel);
      jPanel.setBackground(Color.BLACK);
      jProgressBar.setBackground(Color.white);
      jFrame.setVisible(true);
      try{
         for(Integer i = 1;i < 1000;i++){
            //noinspection ConstantConditions
            int an = random.ints(0, 2).findAny().getAsInt();
            if(an==0) {
               k++;
            }
            if(an==1) {
               v++;
            }
            jProgressBar.setString(surN[an]);
            jProgressBar.setStringPainted(true);
            jProgressBar.setValue(i);
            jPanel.repaint();
            Thread.sleep(1);
         }
      }
      catch(InterruptedException e){
         e.printStackTrace();
      }
      jFrame.setVisible(false);
      jPanel.remove(jProgressBar);
      String resu = k.toString() + "     Ваня";
      String resu1 = v.toString() + "   Паша";
      jFrame.remove(jPanel);
      JPanel jPanel1 = new JPanel() {
         
         
         Graphics graphics;
         
         public void paintComponent(Graphics graphics) {
            
            this.graphics = graphics;
            Font courier = new Font("Courier new", Font.BOLD, 18);
            graphics.setFont(courier);
            graphics.drawString(resu, 8, 25);
            graphics.drawString(resu1, 50, 75);
         }
      };
      jFrame.add(jPanel1);
      jFrame.setVisible(true);
      jFrame.setAlwaysOnTop(true);
      System.err.println(k + " Кудряшов\n" + v + " Винниченко\n");
   }
}


//16.01.2018 (16:44) by {IKudryashov}