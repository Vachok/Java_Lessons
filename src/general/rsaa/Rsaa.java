package general.rsaa;



import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.awt.*;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;



public class Rsaa {
   
   public static void main(String[] args) throws Exception {
      
      String s = "hello world";
      
      Cipher cipher = Cipher.getInstance("RSA");
      KeyPairGenerator pairGen = KeyPairGenerator.getInstance("RSA");
//      Генерация рандом-ключа с указанием размера
//      SecureRandom random = new SecureRandom();
//      pairGen.initialize(512, random);
      KeyPair keyPair = pairGen.generateKeyPair();
      Key publicKey = keyPair.getPublic();
      Key privateKey = keyPair.getPrivate();
      cipher.init(Cipher.ENCRYPT_MODE, publicKey);
      
      byte[] bytes = cipher.doFinal(s.getBytes());
      for(byte b : bytes){
         System.out.print(b);
      }
      System.out.println("-------------------------------");
      Cipher decryptCiper = Cipher.getInstance("RSA");
      decryptCiper.init(Cipher.DECRYPT_MODE, privateKey);
      byte[] decryptedBytes = decryptCiper.doFinal(bytes);
      for(byte b : decryptedBytes){
         System.out.print(( char ) b);
      }
   }
}
