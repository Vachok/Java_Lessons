package general.aesc;



import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;



public class AesCh {
   
   public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
      
      String s = "hello world";
      
      Cipher cipher = Cipher.getInstance("AES");
/*   1 способ генерации ключа. Random
      KeyGenerator kgen = KeyGenerator.getInstance("AES");
      kgen.init(128);
      SecretKey key = kgen.generateKey();*/
      
      SecretKeySpec key = new SecretKeySpec("Bar12345Bar12345".getBytes(), "AES");
      cipher.init(Cipher.ENCRYPT_MODE, key);
      
      byte[] bytes = cipher.doFinal(s.getBytes());
      for(byte b : bytes){
         System.out.print(b);
      }
      System.out.println("");
      Cipher decryptCiper = Cipher.getInstance("AES");
      decryptCiper.init(Cipher.DECRYPT_MODE, key);
      byte[] decryptedBytes = decryptCiper.doFinal(bytes);
      for(byte b : decryptedBytes){
         System.out.print(( char ) b);
      }
   }
}

/*
Шифруем: https://goo.gl/vTffT5
* */