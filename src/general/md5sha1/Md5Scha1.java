package general.md5sha1;



import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class Md5Scha1 {
   
   public static void main(String[] args) throws NoSuchAlgorithmException {
      
      String str = "myPass";
      MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
      MessageDigest md5 = MessageDigest.getInstance("MD5");
      byte[] bytes = md5.digest(str.getBytes());
      StringBuilder builder = new StringBuilder();
      for(byte b : bytes){
         builder.append(String.format("%02X", b));
      }
      System.out.println(builder.toString());
   }
}

// MD5 https://goo.gl/Au2BBn